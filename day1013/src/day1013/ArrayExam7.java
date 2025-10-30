package day1013;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam7 {
	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] seat = new int[SIZE];
		int[] book = new int[SIZE];
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("_________________________________");
			for(int i=0;i<SIZE;i++) {
				System.out.println((i+1)+"  ");
			}
			System.out.println("＼n _________________________________");
			for(int i=0;i<SIZE;i++) {
				System.out.println(seat[i]+"  ");
			}
			System.out.println("＼n_________________________________");
			System.out.println("원하는 좌석번호를 입력하세요 > ");
			int num = scan.nextInt();
			
			if(num<=0) {
				System.out.println("유효한 숫자가 아닙니다");
				break;
			}
			if(seat[num-1]==0) {
				System.out.println("예약되었습니다 ");
				seat[num-1]=1;
			}else {
				
				System.out.println("이미 선택된 좌석입니다 ");
			}
			
		}
		
	}
}
