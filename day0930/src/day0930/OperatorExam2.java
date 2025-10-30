package day0930;

public class OperatorExam2 {
	public static void main(String[] args) {
		
		// 아래 변수에서 백의 자리 이하를 버리기
		// 456이면 결과는 400, 111 이면 결과는 100
		
		int num1 = 511;
		
		int result = (num1 / 100) * 100;
        
        System.out.println("100의 자리 이하 버리기: " + result);
		
        //한 바구니에 과일 10개씩 담을 수 있다. 123개 과일을 담기 위해 바구니가 몇개 필요한가?
        
        int apple = 123;
        int result2 = (apple + 9) / 10;  // 나머지를 고려한 올림
        System.out.println(result2);      // 13 출력

        // 화씨(f)를 섭씨(c)로 변환
        // 변환 공식 c= 5/9 x (f-32)
        // 단 반환 결과는 소수점 셋째자리에서 반올림 할것 (반올림 함수를 사용하지 않고 처리하기)
        
        int f = 100;

        double c = 5.0 / 9 * (f - 32);

        System.out.println("섭씨 결과: "+c);
        

        double roundC = (int)(c * 100 + 0.5) / 100.0;

        System.out.println("화씨 " + f + "도는 섭씨 " + roundC + "도입니다.");
        
        
	}
}
