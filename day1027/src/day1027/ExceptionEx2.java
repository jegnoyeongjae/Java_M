package day1027;

public class ExceptionEx2 {
	public static void main(String[] args) {
		String data1 = "100";
		//String data2 = "aa0";
		String data2 = "0";

		// 문자열을 숫자(기본형)로 변환
		int value1 = Integer.parseInt(data1);
		

		try {
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			int result2 = value1 / value2;
			
			// 컴파일 에러
			System.out.println(result);
			
			// ArithmeticException
			System.out.println(result2);
			
			
/* 	try {
			int result2 = value1 / value2;
			// ArithmeticException
			System.out.println(result2);
		} catch (ArithmeticException a) {
			System.out.println("0으로 나눌수 없음 "+ a);
		}
*/		
			
			
		} catch (NumberFormatException e) {
			System.out.println("문자열 을 숫자로 변환불가  " + e);
		} catch (ArithmeticException a){
			System.out.println("0으로 나눌수 없음 "+ a);
		} finally {
			System.out.println("필수실행");
		}
	
		/*
		 * Exception in thread "main" java.lang.NumberFormatException: For input string:
		 * "aa0" at java.base/java.lang.NumberFormatException.forInputString(
		 * NumberFormatException.java:67) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:662) at
		 * java.base/java.lang.Integer.parseInt(Integer.java:778) at
		 * day1027/day1027.ExceptionEx2.main(ExceptionEx2.java:11)
		 * 
		 */

	}
}
