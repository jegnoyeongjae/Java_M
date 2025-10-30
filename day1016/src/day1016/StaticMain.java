package day1016;

public class StaticMain {

	public static void main(String[] args) {

		StaticTest1 st1 = new StaticTest1();
		
		st1.instanceMethod();
		st1.iv=10;

		st1.staticInstanceMethod();
		st1.cv=15;
		
	}

}
