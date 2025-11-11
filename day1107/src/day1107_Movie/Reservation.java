package day1107_Movie;

public class Reservation {
	private static int nextReservationId = 1;
	private int reservationId;
	private Movie movie;
	private String seatNumber;
	private String status; // "예매완료" or "취소"

	public Reservation(Movie movie, String seatNumber) {
		this.reservationId = nextReservationId++;
		this.movie = movie;
		this.seatNumber = seatNumber;
		this.status = "예매완료";
	}

	public int getReservationId() {
		return reservationId;
	}

	public Movie getMovie() {
		return movie;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public String getStatus() {
		return status;
	}

	public void cancel() {
		this.status = "취소";
	}

	@Override
	public String toString() {
		return String.format("예매번호: %d | 영화: %s | 좌석: %s | 상태: %s", reservationId, movie.getTitle(), seatNumber,
				status);
	}
}
