package day1021;

public class BookMain {
 public static void main(String[] args) {
     Book book = Book.getInstance("혼자 공부하는 자바", "신용권", 28000);
     book.applyDiscount(10); 

     EBook ebook = EBook.getInstance("SQL첫걸음", "아사이 아츠시", 22000, 1.5, "PDF");
     ebook.applyDiscount(5000);

     System.out.println();
     book.printInfo();
     System.out.println("총 결제금액 (10% 할인) : " + book.getFinalPrice() + "원");

     System.out.println();
     ebook.printInfo();
     System.out.println("총 결제금액(5000원할인 적용) : " + ebook.getFinalPrice() + "원");
 }
}
