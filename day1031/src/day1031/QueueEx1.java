package day1031;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("help를 입력하면 도움말이 출력됩니다.");

		while (true) {
			System.out.print("명령어: ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("q")) { // equalsIgnoreCase 대소문자 모두 일괄 처리
				// 프로그램(JVM) 강제 종료
				// 0: 정상종료 , 0 이외의 값은 비정상 종료로 처리
				System.exit(0);
			} else if (input.equalsIgnoreCase("help")) {

				System.out.println(" help - 도움말출력");
				System.out.println(" q - 프로그램 종료");
				System.out.println(" history - 최근입력한 명령어 " + MAX_SIZE);

			} else if (input.contentEquals("history")) {
				
				
				LinkedList list = (LinkedList) q;

				for (int i = 0; i < q.size(); i++) {
					System.out.println((i + 1) + "." + list.get(i));
				}
			} else {
				save(input);
			}
		}
	}

	public static void save(String input) {
		if (input != null && !input.equals("")) {
			q.offer(input);
			if (q.size() > MAX_SIZE) {
				q.remove();
			}
		}
	}
}
