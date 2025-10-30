package day1017;

public class Car {
	
	int num;
	double gas;
	
	Car(){
		num = 0;
		gas = 0.0;
		System.out.println("자동차 생성");
	}
	
	void set(int num, double gas) {
		this.num = num;
		
		this.gas = gas;
		System.out.println("carNum "+num+" gas " + gas );
	}

}
