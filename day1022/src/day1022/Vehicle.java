package day1022;

//Vehicle.java
public abstract class Vehicle {
 // 필드: 속도
 protected int speed; // protected로 설정하여 하위 클래스에서 접근 가능하도록 함

 // 메서드: 속도 설정 (setSpeed)
 public void setSpeed(int speed) {
     this.speed = speed;
     System.out.println("현재 속도가 " + this.speed + "km/h로 설정되었습니다.");
 }

 // 추상 메서드: 결과를 출력하는 show()
 // 하위 클래스(Car, Plane)에서 반드시 구현해야 함
 public abstract void show();
}