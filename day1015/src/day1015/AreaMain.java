package day1015;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {

		AreaCalculator aCalc = new AreaCalculator();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("직사각형 입력1");
		int wid = scan.nextInt();
		
		System.out.println("직사각형 입력2");
		int hei = scan.nextInt();
		
		int res =aCalc.areaCalc(wid,hei);
		
		System.out.println(res);
	}

}
