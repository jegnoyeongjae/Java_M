package day1001;

import java.util.Scanner;

public class StringExam1 {

	public static void main(String[] args) {

		double num = Math.random();
		
		// 1~6까지 있는 주 사위를 랜덤으로 던졌을때 나오는 결과값 출력
		
		int dice =  (int)(num * 6 +1);
		
		System.out.println(dice);
		
		//성적을 입력받아 등급을 출력
	      //90~100점 A
	      //80~89점 B
	      //70~79점 C
	      //60~69 D
	      //나머지는 F
		 Scanner scan = new Scanner(System.in);

	        System.out.print("점수를 입력하세요 (0 ~ 100): ");
	        int score = scan.nextInt();

	        char result = ' ';
	        
	        
	        // 점수를 10으로 나눈 몫을 기준으로 switch
	        switch (score / 10) {
	            case 10: // 100점도 포함
	            case 9:
	            	result='A';
	                System.out.println("등급: A");
	                break;
	            case 8:
	            	result='B';
	                System.out.println("등급: B");
	                break;
	            case 7:
	            	result='C';
	                System.out.println("등급: C");
	                break;
	            case 6:
	            	result='D';
	                System.out.println("등급: D");
	                break;
	            default:
	            	result='F';
	                System.out.println("등급: F");
	                break;
	        }

	        System.out.println("최종등급: " + result);
	        scan.close();
	}

}
