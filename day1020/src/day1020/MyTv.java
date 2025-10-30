package day1020;

public class MyTv {

	// 외부에서 접근할 수 없도록 접근제어자를 설정하고 MyTvMain1에서 값을 설정하고 출력할 수 있도록 getter,setter를 작성
	
	
	boolean inPowerOn;
	int channel;
	int volume;
	int lastCh;
	
	final int MAX_CHANNEL = 100;
	final int MAX_VOLUME= 100;
	final int MIN_VOLUME = 1;
	final int MIN_CHANNEL = 1;
	
	
	void gotoPrevChannel() {
		
		lastCh = channel;
		System.out.println(lastCh);
	}

	
	
	public boolean isInPowerOn() {
		return inPowerOn;
	}




	public int getChannel() {
		return channel;
	}




	public int getVolume() {
		return volume;
	}




	public int getMAX_CHANNEL() {
		return MAX_CHANNEL;
	}




	public int getMAX_VOLUME() {
		return MAX_VOLUME;
	}




	public int getMIN_VOLUME() {
		return MIN_VOLUME;
	}




	public int getMIN_CHANNEL() {
		return MIN_CHANNEL;
	}




	public void setInPowerOn(boolean inPowerOn) {
		this.inPowerOn = inPowerOn;
	}




	public void setChannel(int channel) {
		this.channel = channel;
	}




	public void setVolume(int volume) {
		this.volume = volume;
	}




	public MyTv(boolean inPowerOn, int channel, int volume) {
		super();
		this.inPowerOn = inPowerOn;
		this.channel = channel;
		this.volume = volume;
	}
	
	
	
	
	
	
}
