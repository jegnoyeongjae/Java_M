package day1028;

class Point implements Cloneable{
	int x;
	int y;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjClone1 {
	public static void main(String[] args) {
		Point p1 = new Point();

		Point p2 = null;

		try {
			p2 = (Point) p1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		p1.x = 10;
		p1.y = 20;
		
		p2.x = 30;
		p2.y = 40;

		System.out.println(p1.x);
		System.out.println(p1.y);
		System.out.println("\\\\\\\\\\\\\\\\");
		System.out.println(p2.x);
		System.out.println(p2.y);
		System.out.println("\\\\\\\\\\\\\\\\");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
