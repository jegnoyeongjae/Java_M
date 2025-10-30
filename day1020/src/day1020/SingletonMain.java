package day1020;

public class SingletonMain {

	public static void main(String[] args) {

		Singleton2 obj1 = Singleton2.getInstance();
		Singleton2 obj2 = Singleton2.getInstance();
		
		
		System.out.println(obj1.getX());
		System.out.println(obj2.getX());
		
		System.out.println("=====================");
		
		obj1.setX(1000);
		
		System.out.println(obj1.getX());
		System.out.println(obj2.getX());
		
		
		
		
		
	}

}
