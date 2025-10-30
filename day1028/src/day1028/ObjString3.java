package day1028;

public class ObjString3 {
	public  static void eTest(String str) {
		int at = str.indexOf("@");
		int dot = str.indexOf(".");
		
		if (at > 0 && dot >0 && dot >at) {
			System.out.println("s");
		}else {
			System.out.println("f");
		}
		
	}

	public static void main(String[] args) {
		
		// 메일주소가 맞는지 확인한느 메서드를 생성하고 검사 
		// 1. 반드시 @가 있어야함
		// 2. 반드시 . 이 있어야함
		// 3. @는 반드시 .보다 먼저 나와야함
		
		String  e1 = "test1@naver.com";
		String  e2 = "test1naver.com";
		String  e3 = "test1.naver@com";
		String  e4 = "test1navercom";
		
		eTest(e1);
		eTest(e2);
		eTest(e3);
		eTest(e4);
		
	}

}
