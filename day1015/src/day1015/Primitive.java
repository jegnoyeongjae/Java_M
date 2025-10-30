package day1015;

public class Primitive {
	
		public static void main(String[] args) {
			
			Data d = new Data();
			d.x = 10;
			System.out.println(d.x);
			
			change(d.x);
			System.out.println("2: "+d.x);
			
			

			
		}
		
		static void change(int x) {
			
			x= 1000;
			System.out.println(x);
		}
}
