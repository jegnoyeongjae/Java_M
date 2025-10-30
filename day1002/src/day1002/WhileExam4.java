package day1002;

import java.util.Scanner;

public class WhileExam4 {

    public static void main(String[] args) {
        // 키보드로 2 이상의 점수를 입력받아서
        // 그 수가 소수인지 아닌지 판단하는 코드 작성

        Scanner scanner = new Scanner(System.in);
        System.out.print("2 이상의 정수를 입력하세요: ");
        int num = scanner.nextInt();

        // 2 이상인지 확인
        if (num < 2) {
            System.out.println("2 이상의 수를 입력하세요.");
            scanner.close();
            return;
        }

        boolean isPrime = true; 

        int i = 2;
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;  
                break;
            }
            i++;
        }

        if (isPrime) {
            System.out.println(num + "는 소수입니다.");
        } else {
            System.out.println(num + "는 소수가 아닙니다.");
        }

        scanner.close();
    }
}
