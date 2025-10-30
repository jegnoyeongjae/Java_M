package day1016;

public class Flower {
	//클래스명 : Flower.java
	//필드 : name, cost
	//메서드 : flowerInfo
	//FlowerMain.java
	//매개변수 2개짜리 생성자 호출
	//장미 한송이 가격은 1,500원입니다.
	//튤립 한송이 가격은 2,000원입니다.
	
	String name;
	int cost;
	


	public Flower(String name, int cost) {
		super();
		this.name = name;
		this.cost = cost;
	}
	

	void flowerInfo () {
		
		System.out.println(name +" 은" + cost+" 입니다.");
	}
	
}
