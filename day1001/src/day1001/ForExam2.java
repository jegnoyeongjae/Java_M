package day1001;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("홀수 숫자를 입력하세요: ");
		int n = scan.nextInt();

		// 입력값 홀수 체크
		if (n % 2 == 0) {
			System.out.println("홀수만 입력 가능합니다.");
			return;
		}

		// 역전 위치
		int mid = n / 2;

		// 위쪽
		for (int i = 0; i <= mid; i++) {
			for (int j = 0; j < mid - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 아래쪽
		for (int i = mid - 1; i >= 0; i--) {
			// 공백
			for (int j = 0; j < mid - i; j++) {
				System.out.print(" ");
			}
			// 별 
			for (int j = 0; j < 2 * i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		scan.close();
	}

}
