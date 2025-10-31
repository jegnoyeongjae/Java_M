package day1031;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	// 순차적(=연속된 데이터)일 때는 ArrayList가 빠르지만,	중간에 뭘 끼워 넣거나 삭제할 때는 LinkedList가 더 효율적이다.
	public static void main(String[] args) {

		/*
		 * arr.add(0, ...) → ArrayList에서는 매번 모든 요소를 한 칸씩 밀기 때문에 느림
		 * 
		 * link.add(0, ...) → LinkedList는 노드 포인터만 변경하므로 훨씬 빠름
		 * 
		 */

		List<String> arr = new ArrayList<String>();
		List<String> link = new LinkedList<String>();

		long startT;
		long endT;

		// ArrayList 테스트
		startT = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			arr.add(0, String.valueOf(i));
		}

		endT = System.currentTimeMillis();

		System.out.println("arr 소요시간: " + (endT - startT) + " 밀리초");

		// LinkedList 테스트
		startT = System.currentTimeMillis();

		for (int i = 0; i < 100000; i++) {
			link.add(0, String.valueOf(i));
		}

		endT = System.currentTimeMillis();

		System.out.println("link 소요시간: " + (endT - startT) + " 밀리초");
	}
}