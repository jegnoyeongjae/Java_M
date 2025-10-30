package day1027;

public class ExceptionEx4 {
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
			
			
		} catch (NumberFormatException | ArithmeticException e) {
			// 예외 문구만 출력
			System.out.println("문자열 을 숫자로 변환불가  " + e);
			// 결과 차이 : 문자열 을 숫자로 변환불가  java.lang.ArithmeticException: / by zero
			// 좀 더 자세한 콜스택의 정보 출력
			e.printStackTrace();
			// 결과 차이: java.lang.ArithmeticException: / by zero
			// at day1027/day1027.ExceptionEx4.main(ExceptionEx4.java:16)
			
			// 좀 더 러프한 에러 정보 출력
			System.out.println( e.getMessage());
			// 결과차이 1:  	e.getMessage(); 만 쓰면 콘솔에 아무런 정보가 출력되지 않음
			// 결과차이 2:    System.out.println( e.getMessage());
			// / by zero 라고 출력됌
			
		} 
//		catch (ArithmeticException a){
//			System.out.println("0으로 나눌수 없음 "+ a);
//		}
	
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
