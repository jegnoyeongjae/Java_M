package day1107_Movie;

public class Movie {
	private int movieId;
	private String title;
	private String genre;
	private int runningTime;
	private int price;
	private boolean[][] seats = new boolean[9][9]; // false=빈좌석, true=예약됨

	public Movie(int movieId, String title, String genre, int runningTime, int price) {
		this.movieId = movieId;
		this.title = title;
		this.genre = genre;
		this.runningTime = runningTime;
		this.price = price;
	}

	public int getMovieId() {
		return movieId;
	}

	public String getTitle() {
		return title;
	}

	public String getGenre() {
		return genre;
	}

	public int getRunningTime() {
		return runningTime;
	}

	public int getPrice() {
		return price;
	}

	public boolean isSeatAvailable(int row, int col) {
		return !seats[row][col];
	}

	public void reserveSeat(int row, int col) {
		seats[row][col] = true;
	}

	public void printSeatMap() {
		System.out.println("\n--- 좌석 현황 (" + title + ") ---");
		System.out.print("   ");
		for (int i = 1; i <= 9; i++)
			System.out.print(i + " ");
		System.out.println();

		for (int i = 0; i < 9; i++) {
			char rowLabel = (char) ('A' + i);
			System.out.print(rowLabel + "  ");
			for (int j = 0; j < 9; j++) {
				System.out.print(seats[i][j] ? "X " : "O ");
			}
			System.out.println();
		}
		System.out.println("O=빈좌석 / X=예약됨");
	}

	@Override
	public String toString() {
		return String.format("[%d] %s (%s) - %d분, %d원", movieId, title, genre, runningTime, price);
	}

}
