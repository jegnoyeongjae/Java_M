package day1106;


class MyRunnable implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println(i+" ");
		}
	}
}

public class ThreadEx2 {
	public static void main(String[] args) {
		MyRunnable t = new MyRunnable();
		Thread t2 = new Thread(t); 
		
		t2.start();
		
		
	}
}
