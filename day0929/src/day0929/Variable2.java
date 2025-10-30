package day0929;

import java.util.Scanner;

public class Variable2 {
	public static void main(String[] args) {
		
		int x = 5;
		int y = 3;
		
		// XOR 연산
		/*
		 *  새로운 변수 z를 선언하지 않고 데이터를 x와 y의 값을 교환 하고싶어서 방법을 찾아보다 XOR 연산을 발견
		 *  XOR 방식은  
		 *  x = 5  → 0101
		 *	 y = 3  → 0011
		 *		
		 *	 x ^ y → 0110 (6)
		 * 처럼 제시한 변수들의 2진수 값을 같은 자릿수끼리 비교하되 비교한 값이 같으면 0 다르면 1로 합치는 방식의 연산 을 실행
		 * 그럼 결과값으로 특정 2진수가 나오고 거기에 다시 기존의 x또는 y를 빼면 그 반대에 해당하는 값이 나오는 방식으로 x와 y의 값을 서로 교환함
		 * 즉 1차적으로 x에 x도 y도 아닌 전혀다른 x+y에 해당하는 2진수를 넣어두고 이에 y를 빼서 x값을 (즉 y가 원래의 x값을 가짐)
		 * x값을 갖게된 y에 x+y값을 가진 x에 x값을 빼서 y값을 구해서 x와 y를 새로운 변수없이 교환함. 
		 */
		
		x = x^y; 
		y = x^y;
		x = x^y;
		
		
		
		System.out.println("교환된 x값: "+x);
		System.out.println("교환된 y값: "+y);

		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
	
		
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
	}
}
