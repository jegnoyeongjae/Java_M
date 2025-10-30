package day1017;

public class Student {
   String name;
   int ban;
   int no;
   int kor;
   int eng;
   int math;
   

   public Student(String name, int ban, int no, int kor, int eng, int math) {
      super();
      this.name = name;
      this.ban = ban;
      this.no = no;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
   }

   int getTotal() {
      return kor+eng+math;
   }
   
   float getAverage() {
      return getTotal() /3 ;
   }
   
}