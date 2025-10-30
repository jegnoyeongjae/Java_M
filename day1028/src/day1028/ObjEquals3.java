package day1028;

import java.util.Scanner;

public class ObjEquals3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String id = "tes";
		String pass = "tes123";
		
		System.out.println("id");
		String cId = s.nextLine();

		System.out.println("pass");
		String cPass = s.nextLine();
		
		if(id.equals(cId)&& pass.equals(cPass)) {
			System.out.println("login");
		}else {
			System.out.println("fail");
		}
	}

}
