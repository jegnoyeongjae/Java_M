package day1020;

public class BankMain {
 public static void main(String[] args) {

	 BankAccount acc1 = BankAccount.getInstance("123-456", 1000);
     acc1.deposit(500);       
     acc1.withdraw(200);     
     acc1.applyInterest();   

     SavingsAccount acc2 = SavingsAccount.getInstance("456-789", 2000, 500);
     acc2.deposit(1000);   
     acc2.withdraw(2500);    
     acc2.applyInterest(0.03); 

     System.out.printf("%s의 잔액 : %.0f만원\n", acc1.getAccount(), acc1.getBalance());
     System.out.printf("%s의 잔액 : %.0f만원\n", acc2.getAccount(), acc2.getBalance());
 }
}
