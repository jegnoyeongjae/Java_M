package day1020;

public class SavingsAccount extends BankAccount {
 private final double minBalance;
 private static SavingsAccount instance;

 public static SavingsAccount getInstance(String account, double balance, double minBalance) {
     if (instance == null) {
         instance = new SavingsAccount(account, balance, minBalance);
     }
     return instance;
 }

 private SavingsAccount(String account, double balance, double minBalance) {
     super(account, balance);
     this.minBalance = minBalance;
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && (getBalance() - amount) >= minBalance) {
         super.withdraw(amount);
     } else {
         System.out.println("출금 실패: 최소 잔액 유지 조건을 만족하지 않음.");
     }
 }

 public double getMinBalance() {
     return minBalance;
 }
}
