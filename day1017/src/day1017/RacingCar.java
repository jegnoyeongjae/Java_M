package day1017;

public class RacingCar  extends Car{
	int course;
	
	RacingCar(){
		course=0;
		System.out.println("CreateRacingCar");
	}

	void setCourse(int course) {
		this.course = course;
	}
}
