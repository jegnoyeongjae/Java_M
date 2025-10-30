package day1013;

import java.util.Scanner;

public class ArrayExam6 {
	public static void main(String[] args) {
		String[] word = {"television","computer","keyboard","phone"};
		Scanner scan = new Scanner(System.in);

		for(int i =0; i<word.length; i++) {
			char [] q = word[i].toCharArray();
			
			for(int j =0; j<q.length; j++) {
				int idx = (int)(Math.random()*q.length);
				char temp=q[j];
				q[j]=q[idx];
				q[idx]=temp;
			}
			
			System.out.print(q);
			System.out.println("의 정답을 입력하세요 > ");
			String answer = scan.nextLine();
			
			if(word[i].equals(answer)) {
				System.out.println("정답입니다 ");
			}else {
				System.out.println("오답입니다");
			}
			}
	}
}
