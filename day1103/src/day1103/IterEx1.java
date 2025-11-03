package day1103;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class IterEx1 {
	public static void main(String[] args) {
		HashSet list = new HashSet();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		
		// iterator 객체 생성 - interator는 1회용 객체이다. 즉 21번 27번 두번 출력하지만 결과는 21번에서 한번 전체를 출력후 소멸 만약 27번에서도 출력하고프다면 27번 위에 새로운 객체 생성이 필요하다.
		Iterator it = list.iterator();
		
		// list에 다음 값이 존재 하는지 확인
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}

		// list에 다음 값이 존재 하는지 확인
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// 9번 라인의 list가 arrayList였다가 HashSet으로 바뀌자 에러가났지만 반면 iterator로 구현한 출력문은 에러가 안남 즉 출력시에는 iterator를 사용하는게 더 효율적이다. (수정에 유연함)
		for(int i = 0; i < list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
		
	}
}
