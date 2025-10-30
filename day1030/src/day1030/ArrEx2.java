package day1030;

import java.util.ArrayList;
import java.util.Collections;

public class ArrEx2 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		
		list1.add(new Integer(0));
		
		// arrayList에는 객체타입만 저장가능함 저장할 값에 기본형이 오면 자동 현변환이 발생하여 기본형이 참조형으로 변환되어 저장 즉 list1.add(new Integer(0)); 이럴 필요가 없음.
		
		list1.add(10);
		list1.add(4);
		list1.add(66);
		list1.add(778);
		list1.add(7);
		list1.add(248);
		
		System.out.println(list1.size());
		System.out.println(list1);
		
		// 복사하고자 하는 배열의 1~4미만의 인덱스에 해당하는 값을 복사
		ArrayList list2= new ArrayList(list1.subList(1, 4));
		
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);
		print(list1, list2);
		
		// list2가 list1에 모든 요소가 다 포함 되어 있는지 확인
		System.out.println(list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"E");
		print(list1, list2);
		
		list2.set(0, "ER");
		print(list1, list2);
		System.out.println("word: "+ list2.indexOf("ER"));
		System.out.println("number: "+ list2.indexOf(66));
		System.out.println("worngNumber: "+ list2.indexOf(88));
		print(list1, list2);
		
		// 해당 인덱스의 값이 삭제되는 메서드 
		list1.remove(1);

		
		// 특정 값을 삭제
		list1.remove(Integer.valueOf(7));
		print(list1, list2);
		
		
		for (int i = 0; i<list2.size(); i++) {
			list2.remove(i);
		}
		print(list1, list2);
		// res: [10, E, C]  분면 for문에서 0번인덱스부터 지우기에 전부 지워져야 하나 배열안에 값이 남는다 이유는 0번이 삭제되면 1번 인덱스가 0번이 되어있는 배열이 복사되고 다시 그 복사된 배열의 1번 인덱스를 삭제 하기 때문에 하나 건너뛰어 삭제하는 꼴이다. 
		
		for (int i = list2.size()-1; i>=0; i--) {
			list2.remove(i);
		}
		print(list1, list2);
		// res: [] 61번의 이유 때문에 배열 전체의 내용을 직접 비우고 싶다면 가장 마지막 인덱스 부터 지우면서 내려와야함 ㅇㅇ
		
		// 중복되는 부분만 제거
		for (int i = list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		
		}
		
	
	
	static void print(ArrayList list1, ArrayList list2) {
		
		System.out.println(list1);
		System.out.println(list2);
	}
}
