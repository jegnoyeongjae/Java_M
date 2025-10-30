package day1017;

public class Child extends Parent{

	String hobby;
	
	public Child(String name, String hobby) {
		this.hobby = hobby; 
		this.name = name;
	}
	
	@Override
	void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("name = "+this.name+" hobby = "+this.hobby);
	}

}
