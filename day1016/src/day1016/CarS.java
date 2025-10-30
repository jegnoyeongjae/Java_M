package day1016;

public class CarS {

	int num;
	double gas;
	static int sum;
	
	void setCar(int n, double g ) {
		num = n;
		gas =g;
		sum ++;
		System.out.println("make car");
	}
	
	void show() {
		System.out.println("num"+ num);
		System.out.println("fuel"+ gas);
	}
	
	static void showSum() {
		System.out.println("tCar"+ sum);
	}
}
