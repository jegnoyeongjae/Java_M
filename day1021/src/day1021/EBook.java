package day1021;

public class EBook {
    private Book book;  
    private double fileSize;
    private String fileFormat;

    private static EBook instance;

    private EBook(String title, String author, int price, double fileSize, String fileFormat) {
        if (title == null || author == null || price <= 0 || fileSize <= 0 || fileFormat == null) {
            throw new IllegalArgumentException("모든 값이 지정되어야 합니다.");
        }
        this.book = Book.getInstance(title, author, price); 
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    public static EBook getInstance(String title, String author, int price, double fileSize, String fileFormat) {
        if (instance == null) {
            instance = new EBook(title, author, price, fileSize, fileFormat);
        }
        return instance;
    }

    public void applyDiscount(double rate) {
        book.applyDiscount(rate);
    }

    public void applyDiscount(int amount) {
        book.applyDiscount(amount);
    }

    public int getFinalPrice() {
        return book.getFinalPrice();
    }

    public void printInfo() {
        book.printInfo();
        System.out.println("파일크기 : " + fileSize + "MB");
        System.out.println("파일형식: " + fileFormat);
    }
}
