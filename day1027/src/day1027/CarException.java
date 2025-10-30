package day1027;

public class CarException extends Exception{
	
	public CarException(double gas) {
		super(gas+ " Gas T 0");
	}
	
}
