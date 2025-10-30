package day1027;

public class CarMain {

	public static void main(String[] args) {

		Car car = new Car();
		try {
			car.setCar(1234, -10);
		} catch (Exception e) {
			System.out.println(e.getMessage()+ "ex");
		}
		
		car.show();
	}

}
