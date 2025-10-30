package day1030;

import java.util.ArrayList;
import java.util.Vector;

public class ArrList6 {
	
	public static void main(String[] args) {
	
		
		Vector v = new Vector();
		
		v.add("abc");
		
		v.add(100);
		
		
		System.out.println(v.size());
		
		String s = (String) v.get(0);
		System.out.println(s);
		
		ArrayList v2 = new ArrayList();
		
		v2.add("abc");
		
		v2.add(100);
		
		
		System.out.println(v2.size());
		
		String s2 = (String) v2.get(0);
		System.out.println(s2);
		
	}
	

	
	
	
}
