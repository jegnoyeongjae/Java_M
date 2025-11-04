package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapEx2 {
// 3개의 나라 이름과 인구를 입력받아 가장 인구가 많은 나라를 검색하여 출력하시오.
// 입력값은 공백으로 구분하고 예) 한국 5000  결과는 가장 인구가 많은 나라: 중국, 20000 으로 출력.
	
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("country name >");
		
		for(int i = 0; i<3; i++) {
			System.out.println((i+1)+". population > ");
			String nation = s.next();
			int pop  = s.nextInt();
			
			map.put(nation, pop);
			
		}
		
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		String maxNation = null;
		int maxPop = 0 ;
		while(it.hasNext()) {
			
			String name = it.next();
			Integer pop = map.get(name);
			
			// System.out.println(name + " "+ pop);
			
			if (pop>maxPop) {
				maxNation = name;
				maxPop = pop;
			}
		}
		System.out.println("인구가 가장 만은 나라는:  "+maxNation+ " , "+ maxPop);
	}
	
}
