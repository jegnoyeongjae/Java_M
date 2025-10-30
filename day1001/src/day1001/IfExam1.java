package day1001;

import java.util.Scanner;

public class IfExam1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("영문자 입력: ");
        String word = scan.next();

        // 결과를 저장할 StringBuilder
        StringBuilder result = new StringBuilder();

  
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32)); // 대문자 → 소문자
            } else if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32)); // 소문자 → 대문자
            } else {
                result.append('?'); // 알파벳이 아닌 경우
            }
        }

        System.out.println("변환 결과: " + result.toString());

        scan.close();
    }
}
