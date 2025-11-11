package Movie;

public class MainApp {
	public static void main(String[] args) {
		
		// 1. 프로그램 시작메세지
		System.out.println("프로그램 시작");
		
		
		// 2. 메인 메뉴 객체 생성
		Menu menu = MainMenu.getInstance();
		
		// 8. 메뉴 출력과 전환을 반복
		while(menu != null) { // 메뉴가 존재하면 계속해서 반복
			// 9. 현재 메뉴 출력
			menu.print(); // 현재 메뉴 출력
			// 11. 다음 메뉴로 이동(변경)
			menu = menu.next(); // 사용자 입력 후 다음 메뉴로 변경
		}
		
		// 14. 프로그램 종료
		System.out.println("프로그램을 종료 합니다.");
	}
}
