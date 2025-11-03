package day1103;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx1 {

	public static void main(String[] args) {
		String[] arr = {"banana", "grape","Grape", "apple","Apple","orange"};
		
		
		// 기본정렬기준(오름차순) - String클래스의 Comparable 구현에 의해 정렬됨
		Arrays.sort(arr); System.out.println(Arrays.toString(arr));
		
		// 대소문자 구별 없이 정렬 - 대소문자 구별 없이 정렬
		Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(arr));
		
		
		// 내림차순 정렬
		Arrays.sort(arr, new Desending());
		System.out.println(Arrays.toString(arr));
		
	}

	
	class Desending implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			// 객체의 값을 비교하기 위해 Compareble을 구현하고 있는지 확인
			// compareTo()를 사용하려면 해당 객체가 comparable을 구현하고 있어야한다.
			if( o1 instanceof Comparable && o2 instanceof Comparable) {
				Comparable c1 = (Comparable) o1;
				Comparable c2 = (Comparable) o2;
				
				// java에서 값을 비교하거나 정렬할 땐 compareTo()를 사용하는게 기본 규칙이다.
				return c1.compareTo(c2) * -1;
				
				int result = c1.compareTo(o2);
						if(result>0) {
							
							return -1;
						}else {
							
						}
				
			}
			
		
			return 0;
		}
		

	}
}
