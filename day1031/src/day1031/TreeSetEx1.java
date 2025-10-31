package day1031;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx1 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i = 0; i <10; i++) {
			int num = (int) (Math.random()*100);
			set.add(num);
		}
		System.out.println(set); // 결과가 알아서 정렬된 채로 나온다.
	}
}
