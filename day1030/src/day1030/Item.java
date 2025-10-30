package day1030;

public class Item {
    private String name;
    private int price;

    // 생성자
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // toString 오버라이드 → 출력 형식 맞추기
    @Override
    public String toString() {
        return "Item { name: " + name + ", price: " + price + " }";
    }
}