package day1020;

public class Singleton2 {
	private int x;
	private int y;
	
	private static Singleton2 single = new Singleton2();
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	private Singleton2(){}
	
	 public static Singleton2 getInstance() {
	        return single;
	    }
	
	
}
