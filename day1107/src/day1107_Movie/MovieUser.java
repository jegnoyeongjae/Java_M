package day1107_Movie;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieUser implements MovieSystem {
    private User user;
    private MovieList movieList;
    private Scanner sc = new Scanner(System.in);

    public MovieUser(User user, MovieList movieList) {
        this.user = user;
        this.movieList = movieList;
    }

    @Override
    public void menu() {
        while (true) {
            System.out.println("\n==== 사용자 메뉴 ====");
            System.out.println("1. 영화 예매");
            System.out.println("2. 예매 내역 확인");
            System.out.println("3. 예매 취소");
            System.out.println("0. 로그아웃");
            System.out.print("선택: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            switch (choice) {
                case 1 -> reserveMovie();
                case 2 -> user.printReservations();
                case 3 -> cancelReservation();
                case 0 -> { return; }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    // === 예매 기능 ===
    private void reserveMovie() {
        System.out.println("\n--- 영화 목록 ---");
        movieList.printMovies();
        System.out.print("예매할 영화 번호 입력: ");

        int movieId;
        try {
            movieId = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
            sc.nextLine();
            return;
        }

        Movie movie = movieList.getMovieById(movieId);
        if (movie == null) {
            System.out.println("잘못된 영화 번호입니다.");
            return;
        }

        movie.printSeatMap();
        String seat;
        int row, col;

        while (true) {
            System.out.print("좌석 입력 (예: A1): ");
            seat = sc.next().toUpperCase();
            if (seat.length() < 2) {
                System.out.println("잘못된 형식입니다.");
                continue;
            }

            row = seat.charAt(0) - 'A';
            try {
                col = Integer.parseInt(seat.substring(1)) - 1;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 형식입니다.");
                continue;
            }

            if (row < 0 || row >= 9 || col < 0 || col >= 9) {
                System.out.println("좌석 범위를 벗어났습니다.");
                continue;
            }

            if (!movie.isSeatAvailable(row, col)) {
                System.out.println("이미 예약된 좌석입니다.");
                continue;
            }
            break;
        }

        movie.reserveSeat(row, col);
        Reservation reservation = new Reservation(movie, seat);
        user.addReservation(reservation);
        System.out.println("예매 완료! 예매번호: " + reservation.getReservationId());
    }

    // === 예매 취소 기능 ===
    private void cancelReservation() {
        // 예매 내역이 없을 경우
        if (user.getReservations().isEmpty()) {
            System.out.println("\n현재 예매 내역이 없습니다.");
            return; // 사용자 메뉴로 복귀
        }

        while (true) {
            System.out.println("\n--- 현재 예매 내역 ---");
            user.printReservations();

            System.out.print("취소할 예매번호 입력 (0 입력 시 취소): ");

            int id;
            try {
                id = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine(); // 버퍼 비우기
                continue;
            }

            if (id == 0) {
                System.out.println("예매 취소 메뉴를 종료합니다.");
                return; // 사용자 메뉴로 복귀
            }

            boolean found = false;
            for (Reservation r : user.getReservations()) {
                if (r.getReservationId() == id) {
                    if (r.getStatus().equals("취소")) {
                        System.out.println("이미 취소된 예매입니다.");
                    } else {
                        r.cancel();
                        System.out.println("예매가 취소되었습니다.");
                    }
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("잘못된 예매번호입니다. 다시 입력해주세요.");
                continue; // 다시 입력받음
            }
            break; // 정상적으로 처리되면 취소 메뉴 종료
        }
    }
}
