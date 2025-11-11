package day1107_Movie;
import java.util.Scanner;

public class MovieAdmin implements MovieSystem {
    private MovieList movieList;
    private Scanner sc = new Scanner(System.in);

    public MovieAdmin(MovieList movieList) {
        this.movieList = movieList;
    }

    @Override
    public void menu() {
        while (true) {
            System.out.println("\n==== 관리자 메뉴 ====");
            System.out.println("1. 영화 등록");
            System.out.println("2. 영화 목록 조회");
            System.out.println("3. 영화 삭제");
            System.out.println("0. 종료");
            System.out.print("선택: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> addMovie();
                case 2 -> movieList.printMovies();
                case 3 -> removeMovie();
                case 0 -> { return; }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void addMovie() {
        System.out.print("영화 ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("제목: ");
        String title = sc.nextLine();
        System.out.print("장르: ");
        String genre = sc.nextLine();
        System.out.print("상영시간(분): ");
        int time = sc.nextInt();
        System.out.print("가격: ");
        int price = sc.nextInt();

        movieList.addMovie(new Movie(id, title, genre, time, price));
        System.out.println("영화 등록 완료!");
    }

    private void removeMovie() {
        System.out.print("삭제할 영화 ID: ");
        int id = sc.nextInt();
        movieList.removeMovie(id);
        System.out.println("영화가 삭제되었습니다.");
    }
}
