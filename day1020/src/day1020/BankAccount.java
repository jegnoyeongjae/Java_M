package day1020;

public class BankAccount {
 private final String account;
 private double balance;
 private final double interestRate = 0.02;

 private static BankAccount instance;

 public static BankAccount getInstance(String account, double balance) {
     if (instance == null) {
         instance = new BankAccount(account, balance);
     }
     return instance;
 }

 protected BankAccount(String account, double balance) {
     this.account = account;
     this.balance = balance;
 }

 public void deposit(double amount) {
     if (amount > 0)
         balance += amount;
 }

 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance)
         balance -= amount;
 }

 public void applyInterest() {
     balance += balance * interestRate;
 }

 public void applyInterest(double customRate) {
     balance += balance * customRate;
 }

 public String getAccount() {
     return account;
 }

 public double getBalance() {
     return balance;
 }
}


