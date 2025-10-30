package day1030;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class CollectionsEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();

		System.out.println(list1);
		// res: []

		// 컬렉션에 모든 값을 추가 하는
		Collections.addAll(list1, 1, 2, 3, 4, 5);
		System.out.println(list1);
		// res: [1, 2, 3, 4, 5]

		Collections.rotate(list1, 2);
		System.out.println(list1);
		// res: [4, 5, 1, 2, 3]

		// 0번과 3번 인덱스 교환
		Collections.swap(list1, 0, 3);
		System.out.println(list1);
		// res: [2, 5, 1, 4, 3]

		// 값의 위치를 임의로 변경
		Collections.shuffle(list1);
		System.out.println(list1);
		// res: [3, 4, 2, 5, 1]

		// 오름 차순정렬
		Collections.sort(list1);
		System.out.println(list1);
		// res: [1, 2, 3, 4, 5]

		// 내림차순
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
		// res: [5, 4, 3, 2, 1]

		// 해당 인덱스에 있는 값을 반환
		// binarySearch()를 사용 할 때는 반드시 정렬된 상태여야지만 사용 가능하다. 실제로 shuffle() 메서드와 같이 섞여있는
		// 결과물에 사용하면 결과가 0이 출력 된다.
		int idx = Collections.binarySearch(list1, 3);
		System.out.println(idx);
		// res: 2

		System.out.println("max " + Collections.max(list1));
		System.out.println("min " + Collections.min(list1));
		System.out.println("min " + Collections.min(list1, Collections.reverseOrder()));
		/*
		 * res: max 5 min 1 min 5
		 */

		// list를 새로운 값으로 채움
		Collections.fill(list1, 9);
		System.out.println(list1);
		// res: [9, 9, 9, 9, 9]

		// list의 size()와 같은 값의 크기의 새로운 리스트 생성 후 값을 2로 채움
		List newList = Collections.nCopies(list1.size(), 2);
		// Collections.addAll(newList, 1, 3);
		/*
		 * res: List의 값은 한번 설정하면 바꿀수 없기 때문에 에러
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.base/java.util.AbstractList.add(AbstractList.java:155) at
		 * java.base/java.util.AbstractList.add(AbstractList.java:113) at
		 * java.base/java.util.Collections.addAll(Collections.java:5869) at
		 * day1030/day1030.ArrEx3.main(ArrEx3.java:66)
		 */
		System.out.println(newList);
		// res: [2, 2, 2, 2, 2]
		
		
		// 공통 요소 유무 확인 (일치하는 요소가 없으면 true)
		System.out.println(Collections.disjoint(list1, newList));
		// res: true
		
		// 뒤 즉 newList의 값을 list1이 복사
		Collections.copy(list1, newList);
		System.out.println(list1);
		System.out.println(newList);
		
		
		// list에 있는 2를 모두 1로 변경
		Collections.replaceAll(list1, 2, 1);
		System.out.println(list1);
		// res: [1, 1, 1, 1, 1]
		

	}
}
