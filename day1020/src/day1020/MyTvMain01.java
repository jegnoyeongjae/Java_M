package day1020;

public class MyTvMain01 {

	public static void main(String[] args) {

		MyTv tv = new MyTv(true, 57, 13);
		
		System.out.println(tv.channel);
		
		tv.setChannel(88);
		
		tv.gotoPrevChannel();
		System.out.println(tv.channel);
		
		tv.gotoPrevChannel();
	}

}
