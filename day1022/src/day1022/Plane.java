package day1022;

//Plane.java
public class Plane extends Vehicle {
 // 필드: 비행기번호
 private String flight;

 // 생성자: 비행기번호를 설정하고 화면에 출력
 public Plane(String flight) {
     this.flight = flight;
     System.out.println("\n[Plane 클래스 생성자]");
     System.out.println("비행기 편명: " + this.flight + "로 설정되었습니다.");
 }

 // 메서드: 비행기 편명, 속도를 출력하는 show() 메서드 (Vehicle의 추상 메서드 구현)
 @Override
 public void show() {
     System.out.println("\n[Plane 현재 상태]");
     System.out.println("비행기 편명: " + this.flight);
     System.out.println("현재 속도: " + this.speed + "km/h");
 }
}