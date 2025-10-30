package day1001;

import java.util.Scanner;

public class ForExam1 {

	public static void main(String[] args) {

		// 숫자를 입력 받아 1부터 해당 숫자까지의 짝수합: 홀수합: 총합계: 출력하기
		
		Scanner scan = new Scanner(System.in);
		
		int  sum =  scan.nextInt() ;
		
		
		int j = 0 , h = 0;
		
		for(int i =1; i <= sum; i++) {
			System.out.println(i);
			if (i % 2 == 0) {
				j += i; // 짝수일 때
			} else {
				h += i; // 홀수일 때
			}
			
			
		}
		
		System.out.println("짝 "+ j);
		System.out.println("홀 "+h);
		
		
		
	}

}
