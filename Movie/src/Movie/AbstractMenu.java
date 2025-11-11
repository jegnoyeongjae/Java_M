package Movie;

import java.util.Scanner;

// 메뉴 인터페이스를 구현하는 추상클래스
// 메인 메뉴와 관리자 메뉴의 부모클래스
public class AbstractMenu implements Menu{

	protected String menuText;	// 기본 메뉴
	protected Menu prevMenu;		// 이전 메뉴
	
	protected static final Scanner scan = new Scanner(System.in);
	
	
	// 10. 메뉴의 기본 문구 출력
	@Override
	public void print() {
		
		System.out.println("\n"+ menuText);
		
	}

	//이전 메뉴 이동
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu  = prevMenu;
	} 
	// 6. 생성자
	public AbstractMenu(String menuText, Menu prevMenu) {
		super();
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}

	public Menu next() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
