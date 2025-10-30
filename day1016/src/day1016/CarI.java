package day1016;

public class CarI {

	int num;
	double gas;
	
	void setCarI(int n, double g ) {
		num = n;
		gas =g;
		System.out.println("make car");
	}
	
	void showI() {
		System.out.println("num"+ num);
		System.out.println("fuel"+ gas);
	}
}
