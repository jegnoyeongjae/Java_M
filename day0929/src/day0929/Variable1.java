package day0929;

public class Variable1 {
	public static void main(String[] args) {
		
//		BYTE 데이터 저장범위 : -127~127 까지
		byte x = 10 ;
		// byte x2 = 130 ; Type mismatch: cannot convert from int to byte 에러 발생
		
		char ch  = 'a';
		// char chE  = ''; Invalid character constant에러
		String str = "a";
		String strE = "";  // String은 공백 가능
		
		// 이름 나이 주소를 각각 변수에 저장해서 콘솔에 출력
		String name = "햄";
		String addr = "부산언저리";
		String age = "12";
		
		
		System.out.println(x);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(strE);
		System.out.println(name);
		System.out.println(addr);
		System.out.println(age);
		System.out.println(age +"살 이름: "+ name+" 주소: " + addr);

	}
}
