package day1016;

public class PrintMain {
	
	void show(double d){
		double show = d;
		System.out.println(show);
	}
	void show(boolean a){
		boolean show = a;
		System.out.println(show);
	}
	void show(int a){
		long show = a;
		System.out.println(show);
	}
	void show(String a){
		String show = a;
		System.out.println(show);
	}
	
	
	public static void main(String[] args) {
		// show()메서드를 호출하여 콘솔에 결과 값을 출력하고자함
		
		PrintMain printer = new PrintMain();
		
		printer.show(10);
		printer.show(true);
		printer.show(5.7);
		printer.show("하하하");
		
		
	}
}
