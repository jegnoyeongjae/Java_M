package day1024;

public class A {
	A(){
		System.out.println("createA");
	}
	class B{
		B(){
			System.out.println("createB");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	static class C{
		C(){
			System.out.println("create c");
		}
		int field1;
		static int field2;
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	
}
