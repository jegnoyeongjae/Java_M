package day1104;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx3 {

    // (책제목 + 저자) → Book 객체로 관리
    private static Map<String, Book> bookMap = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n====== 도서 관리 프로그램 ======");
            System.out.println("1. 도서 추가");
            System.out.println("2. 도서 검색");
            System.out.println("3. 전체 도서 목록");
            System.out.println("4. 도서 가격 수정");
            System.out.println("5. 도서 삭제");
            System.out.println("6. 종료");
            System.out.print("메뉴 선택: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addBook();
                    break;
                case "2":
                    searchBook();
                    break;
                case "3":
                    showAllBooks();
                    break;
                case "4":
                    updatePrice();
                    break;
                case "5":
                    deleteBook();
                    break;
                case "6":
                    System.out.println("📕 프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("⚠️ 잘못된 입력입니다. 다시 선택해주세요.");
            }
        }
    }

    private static void addBook() {
        System.out.print("책 제목: ");
        String title = sc.nextLine();
        System.out.print("저자 이름: ");
        String author = sc.nextLine();

        String key = title + "_" + author;

        if (bookMap.containsKey(key)) {
            System.out.println("⚠️ 동일한 책 제목과 저자가 이미 존재합니다.");
            return;
        }

        System.out.print("가격: ");
        int price = Integer.parseInt(sc.nextLine());

        bookMap.put(key, new Book(title, author, price));
        System.out.println("✅ 도서가 추가되었습니다.");
    }

    private static void searchBook() {
        System.out.print("검색할 책 제목: ");
        String title = sc.nextLine();
        boolean found = false;

        for (Book book : bookMap.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ 해당 책을 찾을 수 없습니다.");
        }
    }

    private static void showAllBooks() {
        if (bookMap.isEmpty()) {
            System.out.println("📂 등록된 도서가 없습니다.");
            return;
        }

        System.out.println("=== 전체 도서 목록 ===");
        for (Book book : bookMap.values()) {
            System.out.println(book);
        }
        System.out.println("=====================");
    }

    private static void updatePrice() {
        System.out.print("가격을 수정할 책 제목: ");
        String title = sc.nextLine();

        for (Book book : bookMap.values()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.print("새로운 가격: ");
                int newPrice = Integer.parseInt(sc.nextLine());
                book.setPrice(newPrice);
                System.out.println("💰 가격이 수정되었습니다.");
                return;
            }
        }

        System.out.println("❌ 해당 책을 찾을 수 없습니다.");
    }

    private static void deleteBook() {
        System.out.print("삭제할 책 제목: ");
        String title = sc.nextLine();
        String keyToRemove = null;

        for (String key : bookMap.keySet()) {
			Book book = bookMap.get(key);
			if (book.getTitle().equalsIgnoreCase(title)) {
                keyToRemove = key;
                break;
            }
        }

        if (keyToRemove != null) {
            bookMap.remove(keyToRemove);
            System.out.println("🗑️ 도서가 삭제되었습니다.");
        } else {
            System.out.println("❌ 해당 책을 찾을 수 없습니다.");
        }
    }
}
