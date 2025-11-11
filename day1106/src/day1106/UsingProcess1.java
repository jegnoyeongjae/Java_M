package day1106;

class UsingThread1 extends Thread{
	@Override
	public void run() {
		for (int i=0; i<300; i++) {
			System.out.print("#");
			
		}
		System.out.println("소요시간: "+( System.currentTimeMillis() - UsingProcess1.statTime));
	}

}

public class UsingProcess1{
	static long statTime = 0;
	
	public static void main(String[] args) {
		UsingThread1  ut1 = new UsingThread1();
		statTime = System.currentTimeMillis();
		ut1.start();
		
		for(int i = 0; i<300; i++) {
			System.out.print("*");
		}
		System.out.println(" ");
		System.out.println("소요시간: "+(System.currentTimeMillis() - UsingProcess1.statTime));
	}
}