package day1030;

import java.util.List;
import java.util.Vector;

public class ArrList5 {
	
	public static void main(String[] args) {
	
		// 게시판에 제목, 내용, 작성자를 저장하기.
		
		List<Board> list = new Vector<>(); //앞과 뒤의 제네릭 타입이 같을경우 생략가능
		
		
		list.add(0, new Board("title", "con", "wri"));
		list.add(1, new Board("title2", "con", "wri"));
		list.add(2, new Board("title3", "con", "wri"));
		list.add(3, new Board("title4", "con", "wri"));
		list.add(4, new Board("title5", "con", "wri"));
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i).title);
		}

	}


	
}
