package day1015;

public class Recuresive4 {
   public static void main(String[] args) {
      System.out.println("sum2 : " + sum2(1));
   }
   
   static int sum2(int num) {
      System.out.println("시작 : " + num);
      int result = 0;
      
      if(num > 3) {
         System.out.println("끝 : " + num);
         return num;
      } else {
         result = sum2(num+1);
      }
      
      System.out.println("종료 : " + num);
      return result;
   }
   
   
}