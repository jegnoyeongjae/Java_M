package day0930;

public class Literal1 {

	public static void main(String[] args) {

		int var1 = 0b1011;			// 2진수
		int var2 = 0205;			// 8진수
		int var3 = 3224;		// 10진
		int var4 = 0xb6;			// 16진수
		
		
		System.out.println("var1: "  + var1);
		System.out.println("var2: "  + var2);
		System.out.println("var3: "  + var3);
		System.out.println("var4:"  + var4);
		
		int x = 10;
	      int y = 10;
	      int z = 0;
	      
	      x++;
	      ++x;
	      System.out.println("x : " + x);
	      
	      y--;
	      --y;
	      System.out.println("y : " + y);
	      
	      z = x++;
	      System.out.println("z : " + z);
	      System.out.println("x : " + x);
	      
	      z= ++x;
	      System.out.println("z : " + z);
	      System.out.println("x : " + x);
	      
	      z = ++x + y++;
	      System.out.println("z : " + z);
	      System.out.println("x : " + x);
	      System.out.println("y : " + y);
	}

}
