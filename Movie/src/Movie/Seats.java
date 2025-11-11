package Movie;

import java.util.ArrayList;

public class Seats {
	public static final int MAX_ROW = 5; // 좌석의 최대 행
	public static final int MAX_COL = 9; // 죄석의 최대 열
	private String[][] map = new String[MAX_ROW][MAX_COL]; // 좌석별 예매 현황

	// 생성자
	public Seats(ArrayList<Reservation> re) throws Exception {
		
		System.out.println(re.size());
		// 빈 좌석을 'o' 으로 초기화 하기 위해 사용
		for (int i = 0; i < MAX_ROW; i++) {
			for (int j = 0; j < MAX_COL; j++) {
				map[i][j] = "o";
			}
		}

		// 이미 예매된 좌석을 표시함
		for (int i = 0; i < re.size(); i++) {
			Reservation r = re.get(i);
			String seatName = r.getSeatName().trim();
			System.out.println(seatName);
			mark(seatName);
		}
	}

	public void show() {
		System.out.println("==================");
		System.out.println("          S C R E E N         ");
		System.out.println("==================");

		for (int i = 0; i < MAX_ROW; i++) {
			System.out.printf("%c", 'A' + i); // A~E까지의 행 이름 출력
			for (int j = 0; j < MAX_COL; j++) {
				System.out.printf("%s", map[i][j]); // o, x를 표시
			}
			System.out.println();
		}
		System.out.println("1 2 3 4 5 6 7 8 9");
	}

	// 입력된 좌석명의 위치에 예매 여부를 표시
	public void mark(String seatName) throws Exception {
		// toCharArray(); 좌석명을 문자형 배열로 변환
		char[] temp = seatName.trim().toCharArray();
		
		System.out.println(temp);

		// 문자간의 뺄셈은 아스키 코드 값의 차이로 계산
		int row = temp[0] - 'A'; // 행 인덱스 계산
		int col = temp[2] - '1'; // 열 인덱스 계산
		// 예매된 좌석일 경우
		if ("x".equals(map[row][col])) {
			throw new Exception("이미 예매된 좌석입니다.");
		}
		map[row][col] = "x";
	}
}
