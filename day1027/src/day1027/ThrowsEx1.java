package day1027;

public class ThrowsEx1 {
	public static void main(String[] args)  {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception{
		
		try {
			throw new Exception();
			
		} catch (Exception e) {
			System.out.println("메서드2에서 이미 처리함");
			// method2() 에서 처리한 에러를 해당 메서드를 호출한 메서드에서도 처리하도록 하고싶을 때 해당 에러를 다시 재 발생 시켜서 넘김 이를 위해 try/catch로 처리했음에도 threow 가 메서드에 붙어있을 필요가잇음.
			throw e;
		}
	}
	
	/*
	 * 해당 방법으로는 에러는 나지 않으나 최종적으로 도착하는 메서드에서 별도의 예외처리가 없으니 그냥 에러가 그대로 출력됨
	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}
	 * 
	 * */
}
