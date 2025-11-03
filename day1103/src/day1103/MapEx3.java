package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();

		map.put("Spring", "123");
		map.put("summer", "1122");
		map.put("fall", "1234");
		map.put("winter", "1313");

		// summer의 비밀번호를 12345로 변경하고 사용자에게 아이디와 비밀번호를 입력받아 로그인하도록 처리
		// 아이디나 비밀번호가 잘못되었을 때는 로그인 실패 메세지를 출력

		map.put("summer", "12345"); 

		Scanner sc = new Scanner(System.in);

		System.out.print("아이디를 입력하세요: ");
		String id = sc.nextLine();

		System.out.print("비밀번호를 입력하세요: ");
		String password = sc.nextLine();

		if (map.containsKey(id)) {
			String storedPassword = map.get(id);
			if (storedPassword.equals(password)) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패: 비밀번호가 올바르지 않습니다.");
			}
		} else {
			System.out.println("로그인 실패: 존재하지 않는 아이디입니다.");
		}

		sc.close();
	}
}