package day0930;

import java.util.Scanner;

public class Scanner2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// next는 입력받는 값에 공백이 있으면 거기서 잘라서 출력한다. 즉 [헬로 월드] 라고 입력 받았다면 헬로 만 출력됨.
		String str = scan.next();
		System.out.println(str);

		// 때문에 nextLine을 사용한다.
		String str2 = scan.nextLine();
		System.out.println(str);

		System.out.println("name: ");
		String name = scan.nextLine();
		System.out.println("addr: ");
		String addr = scan.nextLine();
		
		System.out.println(name+ addr);
		
	}

}
