package day1031;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		Object[] objarr = { "1", new Integer(1), 2, "2", "2", "2", "3", "3", "4", "4" };

		 Set set = new HashSet();
		// List set = new ArrayList(); 중복이 가능해서 전부 true에 중복된 숫자 전부가 출력됨

		for (int i = 0; i < objarr.length; i++) {
			System.out.println(objarr[i] + " = " + set.add(objarr[i]));
		}

		System.out.println(set);
	}

}
