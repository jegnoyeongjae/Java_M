package day1030;

import java.util.ArrayList;

public class ArrListEx2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("ja");
		list.add("ph");
		list.add("js");
		list.add("db");
		list.add(2, "sql");
		list.add("Spring");
		// ist.add(1); The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int) 에러 제네릭을 통해 잘못된 값의 저장을 방지.
	
		
		int size = list.size();
		System.out.println(size);
		
		
		//배열의 길이 lengh
		
		// 문자열으 길이 lenth
		
		//컬렉션의 크기 size
		
		
	}
}
