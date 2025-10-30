package day1028;

class User implements Cloneable{
	String name; 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class ObjClone2 {
	public static void main(String[] args) {
		User u = new User();
		u.name = "a";
		User copy = null;
		try {
			copy = (User) u.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(u.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(u.equals(copy));
		
	}
}
