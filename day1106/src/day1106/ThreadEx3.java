package day1106;

class MyThread1 extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 10; i>=0; i--) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("t1: "+i+" ");
			
		}
	}
}
class MyRunnable1 implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 0; i<=10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("r1: "+i+" ");
		}
	}
}

public class ThreadEx3 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		
		MyRunnable1 t = new MyRunnable1();
		Thread t2 = new Thread(t); 
		
		
		t1.start();
		t2.start();
		
		
	}
}
