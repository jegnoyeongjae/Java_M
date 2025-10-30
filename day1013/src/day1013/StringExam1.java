package day1013;

import java.util.Arrays;

public class StringExam1 {
	public static void main(String[] args) {
//		String은 공백가능 but, char는 빈문자열 불가
		String str = " ";
		char ch = 'a';
		
		if(str != null && str.equals("")) {
			ch=str.charAt(0);	
		}
		
		
		System.out.println(str);
		System.out.println(ch);
		System.out.println("____________________________________");
		
		String s1 = "str";
		String s2 = "str";
		String s3 = new String("str");
		String s4 = new String("str");
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s4==s3);
		System.out.println(s3.equals(s4));
		System.out.println("____________________________________");

		int[] score1 = new int[5];
		score1[0]=100;
		score1[1]=10000;
		score1[2]=1;
		score1[3]=10;
		score1[4]=1000;
		
		int[] score2 = {1,2,3,4,5};
		
		
			System.out.println(Arrays.toString(score1));
		
		System.out.println("____________________________________");

		for(int i=0; i<5; i++) {
			System.out.println(score2[i]);
		}
		System.out.println("=");
		for (int s : score2) {
			System.out.println(s);
		}
		System.out.println("____________________________________");

//		예외적으로 char타입만 배열을 출력했을때 정상적으로 구분자 없이 출력됨
		char[] chArr = {'a','b','c','d'};
		System.out.println(Arrays.toString(chArr));
	}
}
