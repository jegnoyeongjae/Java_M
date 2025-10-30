package day1029;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.util.Calendar;
import java.util.Scanner;

public class CalendarExample {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        while (true) {
	            try {
	                System.out.print("년도를 입력하세요: ");
	                int year = sc.nextInt();

	                System.out.print("월을 입력하세요 (1~12): ");
	                int month = sc.nextInt();

	                if (month < 1 || month > 12) {
	                    throw new IllegalArgumentException("월은 1~12 사이의 값이어야 합니다.");
	                }

	                Calendar cal = Calendar.getInstance();
	                cal.set(year, month - 1, 1);

	                LocalDate localDate = LocalDate.of(year, month, 1);
	                JapaneseDate japaneseDate = JapaneseDate.from(localDate);

	                System.out.println();
	                System.out.printf("%d년 %d월 (%s)\n", year, month, japaneseDate);
	                System.out.println("Sun Mon Tue Wed Thu Fri Sat");

	                int firstDayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	                int lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

	                for (int i = 1; i < firstDayOfWeek; i++) {
	                    System.out.print("    ");
	                }

	                for (int day = 1; day <= lastDay; day++) {
	                    System.out.printf("%3d ", day);
	                    if ((day + firstDayOfWeek - 1) % 7 == 0) {
	                        System.out.println();
	                    }
	                }
	                System.out.println();

	                break;

	            } catch (IllegalArgumentException e) {
	                System.out.println("입력 오류: " + e.getMessage());
	                System.out.println("다시 입력해주세요.\n");
	                sc.nextLine();
	            } catch (DateTimeException e) {
	                System.out.println("잘못된 날짜 형식입니다. 다시 입력해주세요.\n");
	                sc.nextLine(); 
	            } catch (Exception e) {
	                System.out.println("예상치 못한 오류가 발생했습니다: " + e.getMessage());
	                System.out.println("다시 입력해주세요.\n");
	                sc.nextLine(); 
	            }
	        }

	        sc.close();
	    }
}
