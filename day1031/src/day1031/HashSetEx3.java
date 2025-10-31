package day1031;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("ab");
		set.add("cd");
		set.add(new Person("a1",10));
		set.add(new Person("a1",10));
		
		System.out.println(set);
	}

}
