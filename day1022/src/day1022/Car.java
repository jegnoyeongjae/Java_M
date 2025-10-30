package day1022;

//Car.java
public class Car extends Vehicle {
 // 필드: 차량번호, 연료량
 private int num;
 private double gas;

 // 생성자: 차량번호와 연료량을 설정하고 화면에 출력
 public Car(int num, double gas) {
     this.num = num;
     this.gas = gas;
     System.out.println("\n[Car 클래스 생성자]");
     System.out.println("차량번호: " + this.num + "번, 연료량: " + this.gas + "L로 설정되었습니다.");
 }

 // 메서드: 차량번호, 연료량, 속도를 출력하는 show() 메서드 (Vehicle의 추상 메서드 구현)
 @Override
 public void show() {
     System.out.println("\n[Car 현재 상태]");
     System.out.println("차량번호: " + this.num + "번");
     System.out.println("연료량: " + this.gas + "L");
     System.out.println("현재 속도: " + this.speed + "km/h");
 }
}