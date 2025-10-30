package day1027;

public class ExceptionEx3 {
	public static void main(String[] args) {

		System.out.println(1);
		
		try {
			System.out.println(2);
			System.out.println(0/0);
			System.out.println(3);
		}catch (ArithmeticException e) {
			// 한번 걸린 에러는 다음 catch 에선 굳이 검사 안함
			System.out.println("arithmetic전문 "+ e);
			
			if(e instanceof ArithmeticException)
				System.out.println("if에걸린 아리스 "+e);
			
			System.out.println("아리스4");
			
		} 
		catch (Exception e) {
			System.out.println(e);
			System.out.println(4);
		
		}

		System.out.println(5);

	}
}
