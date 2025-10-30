package day1027;

public class ThrowEx2 {

	static void method(boolean b) {
		try {
			System.out.println(1);
			if (b)
				// 아리스매틱이 실행됐지만 런타임 하위라 런타임으로 날아감 
				throw new ArithmeticException();
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}

		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}

}
