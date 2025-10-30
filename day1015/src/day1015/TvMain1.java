package day1015;

public class TvMain1 {

	public static void main(String[] args) {

		Tv t1 = new Tv();
		t1.channel = 8;
		t1.volume = 49;
		t1.print();
		t1.setChannel(6);
		
		Tv t2 = new Tv();
		t2.channel = 2;
		t2.volume = 55;
		t2.print();
		t2.setChannel(7);
	}

}
