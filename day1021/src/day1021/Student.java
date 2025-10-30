package day1021;

public class Student extends Person{

	public int studentNo;
	
	Student(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
		
	}
	
	public void study() {
		System.out.println("study!!");
	}
	
	

}
