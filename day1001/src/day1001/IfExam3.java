package day1001;

public class IfExam3 {
	public static void main(String[] args) {
		// 출근 시간에 따라 스케쥴표시 8~12시 사이에 랜덤 출근 
		// 8 출근 9 회의 10 외근 나머지 업무
		
		double ran = Math.random();
		
		int ch = (int)(ran * 5) + 8;  

        System.out.println("출근 시간: " + ch + "시");

        switch (ch) {
            case 8:
                System.out.println("08시: 출근");

                break;
            case 9:
                System.out.println("09시: 회의");
                break;
            case 10:
                System.out.println("10시: 외근");
                break;
            default:
                System.out.println("나머지 시간: 일반 업무");
        }
		
		
	}
}
