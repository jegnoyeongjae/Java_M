package Movie;

import java.io.IOException;
import java.util.ArrayList;

//사용자가 사용하는 메인 메뉴 출력과 선택에 다른 기능 구현
public class MainMenu extends AbstractMenu{
	
	//4. 싱글톤이므로 클래스 변수를 이용해서 자기 자신의 객체를 생성
	private static final MainMenu instance = new MainMenu(null);
	
	//기본 문구
	private static final String MAIN_MENU_TEXT = " [ 메인 메뉴] \n" +"1: 영화 예매하기 \n" + "2: 예매 확인하기 \n" + "3: 예매 취소하기 \n" + "4: 관리자 메뉴로 이동\n" + "q: 종료 \n\n" + "메뉴를 선택하세요 >> ";
	
	//5. 외부에서 객체를 생성할 수 없도록 private 생성자(싱글톤)
	private MainMenu(Menu prevManu) {
		super(MAIN_MENU_TEXT, prevManu);	//부모 생성자 호출
	}

	//3. 싱글톤 객체를 반환하는 메서드
	public static MainMenu getInstance() {
		//7. 객체 반환
		return instance;
	}
	
	//12. 사용자의 입력에 따라 다음 메뉴로 진행.
	@Override
	public Menu next() {
		
		//13. 사용자가 입력한 값을 행단위로 가져옴
		switch (scan.nextLine()) {
		case "1":
			reserve();
		
		case "2":
			checkReservation();
			return this;
		
		case "3":
			cancleReservation();
			return this;
		
		case "4":	//관리자 모드
			
			if(!checkAdminPassword()) {
				System.out.println("비밀번호가 틀렸습니다.");
				return this;	//메인 메뉴 객체를 리턴
			}
			
			// 비밀번호가 맞으면 관리자 객체를 가져옴
			AdminMenu adminMenu = AdminMenu.getInstance();
			
			// 현재 메인 메뉴를 관리자 객체가 복귀할 수 있도록
			// 이전 메뉴로 등룍
			adminMenu.setPrevMenu(this);
			
			return adminMenu;
			
		case "q":
			return prevMenu;	//prev메뉴가 null을 전달하므로 종료
		default:
			return this;	//객체 자체를 리턴
		}
	}

	// 1. 예매 하기
	private void reserve() {

		try {
			// 영화 목록출력
			ArrayList<Movie> movies = Movie.findAll();
			for(int i = 0; i<movies.size(); i++) {
				System.out.printf("%s \n", movies.get(i));
			}
			
			// 예매할 영화를 선택
			System.out.print("예매할 영화를 선택하세요 >> ");
			String movieIdStr = scan.nextLine(); // 영화 코드를 입력받아 저장
			
			System.out.println(movieIdStr);
			// 선택된 영화의 정보를 가져옴
			Movie m = Movie.findById(movieIdStr);
			
			// 예매 하고자 하는 영화의 좌석 현황을 가져옴
			ArrayList<Reservation> reservations= Reservation.findByMovieId(movieIdStr);
			
			// 기존 예매 정보에서 좌석의 정보를 가져와 보여줌
			Seats seats = new Seats(reservations);
			seats.show();
			
			System.out.println("좌석을 선택하세요 (예: E-1) : ");
			String SeatName = scan.nextLine().toUpperCase();
			
			seats.mark(SeatName);
			
			Reservation r = new Reservation(Long.valueOf(movieIdStr), m.getTitle(), SeatName);
			
			r.save();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("파일 입출력에 문제가 발생했습니다.");
		} 
		catch (Exception e) {
			System.out.println(">> 예매에 실패 하였습니다.");
		}
	}

	// 2. 예매 확인하기
	private void checkReservation() {
		System.out.println("예매 번호를 입력하세요 > ");
		try {
			Reservation r = Reservation.findById(scan.nextLine());
			
			if( r != null ) {
				System.out.printf(" >> [확인 완료] %s \n", r);
			} else {
				System.out.println(" >> 예매 내역이 없습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("파일 입출력에 문제가 생겼습니다.");
		}
		
		
	}
	
	// 3. 예매 취소하기
	private void cancleReservation() {
		System.out.println("예매 번호를 입력하세요 > ");
		
		Reservation cancelId;
		try {
			cancelId = Reservation.cancel(scan.nextLine());
			if(cancelId != null) {
				System.out.printf(" >> [취소완료] %s의 예매가 취소되었습니다. \n", cancelId);
			}else {
				System.out.println(">> 예매 내역이 없습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("파일 입출력에 문제가 발생했습니다.");
		}
		
		
	}
	
	// 4. 관리자 메뉴 진입하기 전 비밀번호 인증
	private boolean checkAdminPassword() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		return "admin1234".equals(scan.nextLine()); // 사용자가 아무것도 입력안했을 때 pw 가 null로 들어오는 것을 방지하기 위해 앞에 문자열을 넣고 그 문자열과 사용자의 입력값을 비교하는것이 안전하다. 
	}
	

	
}
