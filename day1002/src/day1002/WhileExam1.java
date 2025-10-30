package day1002;

import java.util.Scanner;

public class WhileExam1 {

	public static void main(String[] args) {

		/*
		 * 1. while, Scanner, if문을 이용한다. 2. 난수는 1부터 300까지 숫자 중 발생 3. 숫자 입력 : xxx 4. 만약
		 * 난수보다 작은 수를 입력하면 '난수보다 입력한 값이 작습니다. 큰 수를 입력하세요' 표시 또는 난수보다 큰 수를 입력하면 '난수보다 입력한
		 * 값이 큽니다. 작은 수를 입력하세요' 표시 5. 만약에 맞췄으면 '정답입니다. x번만에 맞추셨습니다!'
		 */

		Scanner scan = new Scanner(System.in);

		int randomNumber = (int) (Math.random() * 300) + 1; 
		int guess;
		int attempts = 0;

		while (true) {
			System.out.print("숫자 입력: ");
			guess = scan.nextInt();
			attempts++;

			if (guess < randomNumber) {
				System.out.println("난수보다 입력한 값이 작습니다. 큰 수를 입력하세요.");
			} else if (guess > randomNumber) {
				System.out.println("난수보다 입력한 값이 큽니다. 작은 수를 입력하세요.");
			} else {
				System.out.println("정답입니다. " + attempts + "번만에 맞추셨습니다!");
				break;
			}
		}

		scan.close();
	}

}
