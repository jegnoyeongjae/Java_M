package day1015;

public class Variables {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.kind = "visa";
		c1.number = 1234;
		
		Card c2 = new Card();
		c2.kind = "master";
		c2.number = 5555;
		
		System.out.println(c1.kind + " || " + c1.number + " || " + c1.width + " || " + c1.height);
		System.out.println(c2.kind + " || " + c2.number + " || " + c2.width + " || " + c2.height);
		
		 c1.width = 50; 
		 c1.height = 80;
		 
		 c2.width = 50; 
		 c2.height = 80;
			
		System.out.println(c1.kind + " || " + c1.number + " || " + c1.width + " || " + c1.height);
		System.out.println(c2.kind + " || " + c2.number + " || " + c2.width + " || " + c2.height);
			
		 
		
	}

}
