package day1107_Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
-- 요구사항 분석

1. 영화 예매 관리 프로그램
- 사용자, 관리자 ( 비번 인증)

2. 사용자는 영화를 예매 하고, 예매 내역 확인, 취소를 수행
- 예매 : 영화와 좌석을 선택 후 진행되고 완료시 예매가 발급
- 예매 확인, 취소. : 예매 번호를 기준으로 진행
- 예매 관련 정보는 파일로 관리 (##)

3. 관리자는 영화를 등록하고 목록을 조회, 등록된 영화 삭제
- 영화 관련 정보는 파일로 관리 (##)

4. 인터페이스와 상속을 활용

-- 핵심 기능 정의

- 프로그램 실행

- 영화 예매
	1. 프로그램 실행
	2. 메인메뉴 출력
	3. 메뉴(영화 예매) 선택
	4. 영화 목록 출력
	5. 영화 선택
	6. 좌석 현황 룰력
	7. 좌석 선택
	8. 예매 완료, 예매 번호 출력
	9. 메인 메뉴 이동
- 예매 확인
	1. 프로그램 실행
	2. 메인메뉴 출력
- 예매 취소


- 관리자 기능
	1. 





*/

public class MovieMain {
	private static List<User> users = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieList movieList = new MovieList();

		// 테스트용 영화 추가
		movieList.addMovie(new Movie(1, "인셉션", "SF", 148, 12000));
		movieList.addMovie(new Movie(2, "타이타닉", "로맨스", 195, 10000));
		movieList.addMovie(new Movie(3, "어벤져스", "액션", 143, 13000));
		movieList.addMovie(new Movie(4, "라라랜드", "뮤지컬", 128, 11000));

		while (true) {
			System.out.println("\n===== 영화 예매 프로그램 =====");
			System.out.println("1. 사용자 모드");
			System.out.println("2. 관리자 모드");
			System.out.println("0. 종료");
			System.out.print("선택: ");
			int choice = sc.nextInt();

			switch (choice) {
			case 1 -> userMode(sc, movieList);
			case 2 -> adminMode(sc, movieList);
			case 0 -> {
				System.out.println("프로그램 종료");
				return;
			}
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void userMode(Scanner sc, MovieList movieList) {
		while (true) {
			System.out.println("\n--- 사용자 모드 ---");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("0. 뒤로가기");
			System.out.print("선택: ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1 -> login(sc, movieList);
			case 2 -> register(sc);
			case 0 -> {
				return;
			}
			default -> System.out.println("잘못된 입력입니다.");
			}
		}
	}

	private static void register(Scanner sc) {
		System.out.print("닉네임: ");
		String nickname = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();

		// 중복 닉네임 검사
		for (User u : users) {
			if (u.getNickname().equals(nickname)) {
				System.out.println("이미 존재하는 닉네임입니다.");
				return;
			}
		}

		users.add(new User(nickname, pw));
		System.out.println("회원가입 완료!");
	}

	private static void login(Scanner sc, MovieList movieList) {
		System.out.print("닉네임: ");
		String nickname = sc.next();
		System.out.print("비밀번호: ");
		String pw = sc.next();

		for (User u : users) {
			if (u.getNickname().equals(nickname) && u.getPassword().equals(pw)) {
				System.out.println("로그인 성공! " + u.getNickname() + "님 환영합니다.");
				new MovieUser(u, movieList).menu();
				return;
			}
		}
		System.out.println("로그인 실패. 닉네임 또는 비밀번호를 확인하세요.");
	}

	private static void adminMode(Scanner sc, MovieList movieList) {
		System.out.print("관리자 비밀번호 입력: ");
		String pw = sc.next();
		if (pw.equals("admin123")) {
			new MovieAdmin(movieList).menu();
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
}
