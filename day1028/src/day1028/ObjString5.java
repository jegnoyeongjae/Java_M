package day1028;

import java.util.Scanner;


public class ObjString5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("writeWord");
		
		String scan =  s.nextLine();
		
		String a = "a,b,c,d,e";
		
		String[] res1 = a.split(",");
		
		System.out.println(res1[1]);
		
		
	   String[] res2 = scan.split(" ");
	   
	   System.out.println("총 "+res2.length+"개의 단어가 있습니다.");
	   

		
		
	}

}
