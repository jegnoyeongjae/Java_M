package day1030;

import java.util.ArrayList;

public class ArrEx1 {
	public static void main(String[] args) {
		Integer[] arr = new Integer[100];
		System.out.println(arr.length);
		// res: 100
		
		System.out.println("==========================");
		
		
		ArrayList list = new ArrayList(100); // 그럼 어차피 가변 크기인데 왜 100으로 초기값을 잡아 놓느냐? 답은 초기 값을(크기를) 확보해 두면 자동 증가 시에 사용되는 리소스가 덜들기 때문이다. (생각보다 배열의 크기가 증가할 때 생각보다 많은 리소스가 드는듯 하다)  
		System.out.println(list.size());
		// res: 0  이유는 컬렉션은 가변크기이기 때문이다. 100이라는 사이즈를 확보해 두었어도 내용이 없기 때문에 0
		
		list.add(10);
		System.out.println(list.size());
		// res: 1  추가 하니까 비로소 길이가 1늘어난 모습
	}
}
