package day1106;


// 스레드를 생성하기 위해 Thread 클래스를 상속
// 단점: 이미 다른 클래스를 상속받은 경우에는 쓰레드 클래스를 상속받을 수 없다.
class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 10; i>=0; i--) {
			System.out.println(i+" ");
		}
	}
}

public class ThreadEx1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
		// 스레드 시작
		t.start();
		
		
	}
}
