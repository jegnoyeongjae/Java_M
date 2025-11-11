package day1107_Movie;

import java.util.ArrayList;
import java.util.List;

public class User {
    private static int nextUserId = 1;
    private int userId;
    private String nickname;
    private String password;
    private List<Reservation> reservations;

    public User(String nickname, String password) {
        this.userId = nextUserId++;
        this.nickname = nickname;
        this.password = password;
        this.reservations = new ArrayList<>();
    }

    public int getUserId() { return userId; }
    public String getNickname() { return nickname; }
    public String getPassword() { return password; }

    public List<Reservation> getReservations() { return reservations; }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void cancelReservation(int reservationId) {
        for (Reservation r : reservations) {
            if (r.getReservationId() == reservationId) {
                r.cancel(); // 상태만 변경
                System.out.println("예매가 취소되었습니다.");
                return;
            }
        }
    }


    public void printReservations() {
        boolean hasActiveReservation = false;

        for (Reservation r : reservations) {
            if (!r.getStatus().equals("취소")) { // 취소된 건 표시 안 함
                System.out.println(r);
                hasActiveReservation = true;
            }
        }

        if (!hasActiveReservation) {
            System.out.println("현재 예매 내역이 없습니다.");
        }
    }

}
