package day1017;

public class StudentMain {
   public static void main(String[] args) {
      Student s1 = new Student( "김풀",1,2,3,4,5);
      
      s1.name = "김풀";
      s1.ban = 1;
      s1.no = 1;
      s1.kor = 60;
      s1.eng = 77;
      s1.math = 98;
      
      System.out.println("이름 : " + s1.name);
      System.out.println("총점 : " + s1.getTotal());
      System.out.println("평균 : " + s1.getAverage());
   }
}
