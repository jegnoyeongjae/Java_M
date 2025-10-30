package day1030;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListEx1 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("ja");
		al.add("ph");
		al.add("js");
		al.add("db");
		al.add("sql");
		al.add("Spring");

		System.out.println(al);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i< al.size(); i++) {
			
			System.out.println(i+"번째 요소: "+ al.get(i));
			
		}
		
		System.out.println("searchNum");
		String in = sc.nextLine();
		if(al.contains(in)) {
			int idx = al.indexOf(in);
			System.out.println(in +" 가 "+ (idx+1) +"번째에 "+" 존재합니다.");
		} else {
			System.out.println(in +" 가 리스트에 존재하지 않습니다.");
		}
		
		
		System.out.println("removeNum");
		String out = sc.nextLine();
		if(al.contains(in)) {
			al.remove(out);
			System.out.println(in +" 를 삭제 했습니다.");
		} else {
			System.out.println(in +" 가 리스트에 존재하지 않습니다.");
		}
		
		
		sc.close();
		
		System.out.println(al);
	}
}
