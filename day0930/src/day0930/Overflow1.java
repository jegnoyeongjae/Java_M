package day0930;

public class Overflow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		byte b = 127;
		// byte b = 128; Type mismatch: cannot convert from int to byte
		
		// 증가시에는 타입이 맞아서 아래와 같은 방식은 가능
		b = ++b;
		
		// 에러없이 돌아가나 오버플로우 되어 -로 출력
		System.out.println(b); // -128 
		
		
		long a = 10000000* 10000000;
		System.err.println("a "+a);
		
		long a2 = 1000000L* 1000000;
		System.err.println("a2 "+a2);

		long a3 = 1000000* 1000000/100000;
		System.err.println("a3 "+a3);
		
		long a4 = 1000000/ 1000000*100000;
		System.err.println("a4 "+a4);
		
		char c1 = 'a';
		int i2 = c1 +1;
		
		char c2 = (char)(c1+1);
		char c3 = ++c1;
		
		System.out.println(c3);
		
		
		int num1 = 'B'-'A';
		System.out.println(num1);
		
		int num2 = '2';
		System.err.println(num2);
		
	}

}
