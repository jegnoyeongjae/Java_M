package day1017;

public class Animal {

	double weight;
	String picture;
	
	void eat(String name) {
		System.out.println( name+"call eat()");
	}
	void sleep() {
		System.out.println("call sleep()");
	}
	void walk() {
		System.out.println("call walk()");
	}
}
