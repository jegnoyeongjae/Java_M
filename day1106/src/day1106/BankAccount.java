package day1106;

public class BankAccount {

	private String userName;
	private String number;
	private int amount;
	
	
	
	
	public BankAccount(String userName, String number, int amount) {
		super();
		this.userName = userName;
		this.number = number;
		this.amount = amount;
	}


	

	@Override
	public String toString() {
		return "BankAccount [userName=" + userName + ", number=" + number + ", amount=" + amount + "]";
	}


}
