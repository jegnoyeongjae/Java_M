package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx4 {

	public static void main(String[] args) {

		// 영어 단어 맞추기 게임
		// 영어를 입력하면 한글로 결과를 출력
		// exit를 입력하면 프로그램 종료

		Map<String, String> wordMap = new HashMap<>();
		wordMap.put("apple", "사과");
		wordMap.put("banana", "바나나");
		wordMap.put("grape", "포도");
		wordMap.put("peach", "복숭아");
		wordMap.put("watermelon", "수박");

		Scanner sc = new Scanner(System.in);
		System.out.println("영어 단어 맞추기 게임입니다!");
		System.out.println("영어 단어를 입력하면 한글 뜻을 알려드립니다.");
		System.out.println("종료하려면 'exit'을 입력하세요.");
		System.out.println("--------------------------------");

		while (true) {
			System.out.print("영어 단어 입력 :  ");
			String input = sc.nextLine().trim().toLowerCase();

			if (input.equals("exit")) {
				System.out.println("프로그램을 종료합니다. 👋");
				break;
			}

			if (wordMap.containsKey(input)) {
				System.out.println("=> " + input + " : " + wordMap.get(input));
			} else {
				System.out.println("❌ 등록되지 않은 단어입니다.");
				System.out.print("새 단어를 등록하시겠습니까? (y/n): ");
				String answer = sc.nextLine().trim().toLowerCase();

				if (answer.equals("y")) {
					System.out.print("한글 뜻을 입력하세요: ");
					String meaning = sc.nextLine().trim();

					wordMap.put(input, meaning);
					System.out.println("✅ '" + input + "' 단어가 등록되었습니다!");
				} else {
					System.out.println("등록하지 않고 넘어갑니다.");
				}
			}
		}
		sc.close();
	}
}
