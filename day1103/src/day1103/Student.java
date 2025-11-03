package day1103;

import java.util.HashMap;
import java.util.Map;

public class Student {

	String name;
	int sno;

	public Student(String name, int sno) {
		super();
		this.name = name;
		this.sno = sno;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			
			return (sno == stu.sno && name.equals(stu.name));
		}else {
			return false;
		}
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return sno + name.hashCode();
	}
	
	
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student("blue", 1), 78);
		map.put(new Student("blue", 1), 66);
		map.put(new Student("blue", 2), 66);
		
		System.out.println(map.size());
	}

}
