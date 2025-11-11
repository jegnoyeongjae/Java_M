package day1107;

public enum Season {

	AUTUMN("AUTUMN"),
	SUMMER("SUMMER"),
	SPRING("SPRING"),
	WINTER ("WINTER");

	
	private final String KName;
	
	
	Season(String KName) {
		this.KName = KName;
	}
	
	public String getKName() {
		
		return KName;
	}


}