package day1021;

//Book.java
public class Book {
 protected String title;
 protected String author;
 protected int price;
 protected static final double FEE_RATE = 0.05;
 protected int discountedPrice;

 private static Book instance;

 private Book(String title, String author, int price) {
     if (title == null || author == null || price <= 0) {
         throw new IllegalArgumentException("모든 값이 지정되어야 합니다.");
     }
     this.title = title;
     this.author = author;
     this.price = price;
     this.discountedPrice = price;
 }

 public static Book getInstance(String title, String author, int price) {
     if (instance == null) {
         instance = new Book(title, author, price);
     }
     return instance;
 }

 public void applyDiscount(double rate) {
     discountedPrice = (int)(price * (1 - rate / 100));
 }

 public void applyDiscount(int amount) {
     discountedPrice = price - amount;
 }

 public int getFinalPrice() {
     return (int)(discountedPrice * (1 + FEE_RATE));
 }

 public void printInfo() {
     System.out.println("책 제목 : " + title);
     System.out.println("저자 : " + author);
     System.out.println("가격 : " + price);
 }
}
