package Movie;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;

public class Reservation {
	private long id; // 예매 번호
	private long movieId; // 영화코드
	private String movieTitle; // 영화 예매 번호
	private String seatName; // 좌석번호
	private static final File file = new File("reservation.txt");

	// Instant.now().toEpochMilli() : 밀리초 단위
	public Reservation(long movieId, String movieTitle, String seatName) {

		this(Instant.now().toEpochMilli(), movieId, movieTitle, seatName);
	}

	public Reservation(long id, long movieId, String movieTitle, String seatName) {

		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}

	// 영화 예매 하기
	// 예매 하고자 하는 영화의 기존 예매 내역을 조회
	public static ArrayList<Reservation> findByMovieId(String movieIdStr) throws IOException {

		System.out.println("리벌제이션 파인드바이 무비 아이디 37라인"+movieIdStr);
		
		ArrayList<Reservation> reservations = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;

		while ((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			
			System.out.println("리절베이션 44라인"+Arrays.toString(temp));

			System.out.println(movieIdStr.equals(temp[1].trim()));
			if (movieIdStr.equals(temp[1].trim())) {
				long id = Long.valueOf(temp[0].trim());
				long movieId = Long.valueOf(temp[1].trim());
				String movieTitle = temp[2].trim();
				String seatName = temp[3].trim();

				Reservation r = new Reservation(id, movieId, movieTitle, seatName);
				reservations.add(r);
				continue;

			}

		}
		br.close();
		return reservations;
	}

	// 예매 정보를 메모장에 저장
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file,true);
		fw.write(this.toFileString() + "\n");
		fw.flush();
		fw.close();
		
	}



	// 예매 확인
	// 예매 번호를 입력 받아서 결과를 출력 하는 방식
	public static Reservation findById(String reservationId) throws IOException {
		Reservation r = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;

		System.out.println(reservationId);
		
		// 입력받은 예매 번호 일치하는지 검색
		while ((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			System.out.println(Arrays.toString(temp));
			System.out.println(reservationId.trim().equals(temp[0]));

			if (reservationId.trim().equals(temp[0])) {
				r = new Reservation(Long.valueOf(temp[0].trim()), Long.valueOf(temp[1].trim()), temp[2].trim(), temp[3].trim());
				
				System.out.println(r);
				break;
			}
		}
		br.close();
		return r;
	}

	// 삭제기능 구현
	public static Reservation cancel(String reservationId) throws IOException {
		Reservation cancelId = null;
		BufferedReader br = new BufferedReader(new FileReader(file));

		String text = "";
		String line = null;

		while ((line = br.readLine()) != null) {
			String[] temp = line.split(", ");

			if (reservationId.equals(temp[0])) {
				cancelId = new Reservation(Long.valueOf(temp[0]), Long.valueOf(temp[1]), temp[2], temp[3]);
				continue;
			}

			text += line + "\n";
		}
		br.close();

		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.flush();
		fw.close();
		return cancelId;
	}

	// 메모장에 예매 내역 등록을 위한 형식
	private String toFileString() {
		// TODO Auto-generated method stub
		return String.format("%d, %d, %s, %s", id, movieId, movieTitle, seatName);
	}
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", movieId=" + movieId + ", movieTitle=" + movieTitle + ", seatName="
				+ seatName + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMovieId() {
		return movieId;
	}

	public String getSeatName() {
		return seatName;
	}

	
}
