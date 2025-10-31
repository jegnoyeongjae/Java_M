package day1031;


public class HashSetEx2 {

	public static void main(String[] args) {
		Person p = new Person("aa", 10);
		Person p2 = new Person("aa", 10);
		
		int hash1 = p.hashCode();
		int hash2 = p.hashCode();
		
		System.out.println(hash1 == hash2);
		
		p.age=20;
		
		int hash3 = p.hashCode();
		
		System.out.println(hash3 == hash2);
		
		int hash4 = p2.hashCode();
		
		System.out.println(hash4 == hash2);

		System.out.println(p.toString());
		System.out.println(p2.toString());
		
		System.out.println(p.equals(p2));
		
	}

}
