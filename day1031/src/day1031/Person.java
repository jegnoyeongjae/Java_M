package day1031;

import java.util.Objects;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Person) {
			Person p = (Person) obj;
			return this.name.equals(p.name) && this.age == p.age;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {

		
		return Objects.hash(name, age);
	}
}
