package day1017;

public class Phone {
	
	String name;
	String spec;
	int cost;
	
	
	public Phone() {}
	
	public Phone(String name, String spec, int cost) {
		this.name = name;
		this.spec = spec;
		this.cost = cost;
	}

	void phoneInfo() {
		System.out.println("prodName "+name +" prodSpec "+spec+" prodPrice "+cost);
	}
	

}
