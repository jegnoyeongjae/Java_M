package day1002;

import java.util.Scanner;

public class WhileExam2 {

    public static void main(String[] args) {
        // 숫자를 입력받아서 각 자리수의 합계를 계산하여 표시
        // 예) 12345 -> 15

        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        int sum = 0;
        int originalNum = num;  // 나중에 출력용

        while (num != 0) {
            sum += num % 10;  // 마지막 자리수 추출해서 더하기
            num /= 10;        // 마지막 자리수 제거
        }

        System.out.println(originalNum + " 각 자리수의 합: " + sum);
        scanner.close();
    }
}
