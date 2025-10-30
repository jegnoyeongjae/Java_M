package day1021;

public class PersonMain {
	
	public static void personInfo(Person person) {
		
		System.out.println("name: " + person.name );
		person.walk();
	}
	
	
	public static void main(String[] args) {
		
		Person p1 = new Person("name" );
		
		
		p1.walk();
		
		Student st1 = new Student("student1", 1);
		
		st1.walk();
		st1.study();
		
		
	}
}
