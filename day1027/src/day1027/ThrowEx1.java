package day1027;

public class ThrowEx1 {

	public static void main(String[] args) {

		try {
		
			Exception e = new Exception("on purpose");
			throw e;
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
