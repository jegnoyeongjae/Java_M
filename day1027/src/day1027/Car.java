package day1027;

public class Car {
	
	private int num;
	private double gas;
	public Car() {
		num = 0;
		gas = 0.0;
		System.out.println("create Car");
	}

	public void setCar(int n , int g) throws CarException {
		if (gas<0) {
			CarException e = new CarException(g);
			throw e;
			
		} else {
			this.num = n;
			this.gas = g;
			
			System.out.println("SetCarNum: "+ n);
			System.out.println("SetGasAmount: "+ g);
		}
		
	}
	
	public void show() {
		System.out.println("CarNum"+ num);
		System.out.println("GasAmount"+ gas);
	}
}
