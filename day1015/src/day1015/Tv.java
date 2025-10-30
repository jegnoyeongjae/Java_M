package day1015;

public class Tv {

	static int channel;
	static int volume;
	
	void channelup() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
	
	void print() {
		System.out.println("c: "+ channel);
		System.out.println("v: "+ volume);
	}
	
	void setChannel(int ch) {
		channel = ch;
	}
	
}
