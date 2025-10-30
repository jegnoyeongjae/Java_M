package day0930;

import java.util.Scanner;

public class OperatorExam1 {

    public static void main(String[] args) {
    	
        // 입력을 통해 90이상은 A, 80 이상은 B, 나머지는 C
        Scanner s = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");
       
        int r = s.nextInt();

        String grade = (r >= 90) ? "A" : (r >= 80) ? "B" : "C";

        System.out.println("등급: " + grade);

        s.close();
    }
    
    
    
}
