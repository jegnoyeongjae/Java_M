package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("A",100);
		map.put("B",200);
		map.put("C",300);
		
		// 1. 키를 이용하여 출력
		Set<String> keySet = map.keySet();
		
		for (String str: keySet) {
			System.out.println("str "+str);
			System.out.println("map "+map.get(str));
		}
		
		// 2. Map.Entry를 이용
		// Map에 저장된 key-value 한쌍을 객체로 얻을 수있음
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for (Map.Entry<String, Integer> entry: entrySet) {
			System.out.println("key "+ entry.getKey());
			System.out.println("value "+ entry.getValue());
		}
		
	}
}
