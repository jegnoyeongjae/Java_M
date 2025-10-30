package day1016;

public class StaticTest1 {

	int iv;
	static int cv;
	
	void instanceMethod() {}
	static void staticInstanceMethod() {}
	
	void instanceMethod2() {
		System.out.println(iv);
		System.out.println(cv);
		instanceMethod();
		staticInstanceMethod();
	}
	
	static void staticMethod2() {
		System.out.println(iv);
		System.out.println(cv);
		InstanceMethod();
		staticInstanceMethod();
	}
}
