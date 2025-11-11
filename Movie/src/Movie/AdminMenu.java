package Movie;
import java.io.IOException;
import java.util.ArrayList;

public class AdminMenu extends AbstractMenu{
	
	//싱글톤 객체 생성
	private static final AdminMenu instance = new AdminMenu(null);
	
	//기본 메뉴 문구
	private static final String ADMIN_MENU_TEXT = " [관리자 메뉴] \n" + "1. 영화 등록하기 \n" + "2. 영화 목록보기 \n" + "3. 영화 삭제하기 \n" + "b. 메인 메뉴로 이동 \n" + "메뉴를 선택하세요 >> ";
	
	
	//private 생성자
	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}
	
	//객체 반환
	public static AdminMenu getInstance() {
		return instance;
	}
	
	@Override
	public Menu next() {
		switch(scan.nextLine()) {
		case "1":
			createMovie();
			return this;
		case "2":
			printAllMovies();
			return this;
		case "3":
			deleteMovie();
			return this;	
		case "b":
			//이전 메뉴(MainMenu)를 반환
			//관리자모드로 들어오기 직전에 setPrevMenu에서
			//이전 메뉴를 저장해둠
			return prevMenu;
		default:
			return this;
		}
	}
	

	//1. 영화 추가하기
	private void createMovie() {
		System.out.println("제목 : ");
		String title = scan.nextLine();
		
		System.out.println("장르 : ");
		String genre = scan.nextLine();
		
		Movie movie = new Movie(title, genre);
		
		try {
			movie.save();
			System.out.println(">> 등록되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(">> 실패하였습니다.");
		}
	}

	//2. 영화 목록 보기
	private void printAllMovies() {
		try {
			ArrayList<Movie> movies = Movie.findAll();
			System.out.println();
			for (int i=0; i<movies.size(); i++) {
				System.out.printf("%s\n", movies.get(i));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("영화 목록 접근에 실패하였습니다.");
		}
		
	}
	
	//3. 영화 삭제하기
	private void deleteMovie() {
		printAllMovies();	//모든 영화 출력
		System.out.println("삭제할 영화코드를 입력하세요 : ");
		
		try {
			Movie.delete(scan.nextLine());
			System.out.println(">> 삭제되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(">> 삭제에 실패하였습니다.");
		}
	}
}
