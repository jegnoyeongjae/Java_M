package day1103;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("블루", 90);
		map.put("레드", 187);
		map.put("그린", 35);
		map.put("블랙", 44);
		map.put("레드", 124);
		
		System.out.println("total " + map.size());
		
		System.out.println("red "+ map.get("레드"));
		
		Set<String>keySet = map.keySet();
		
		Iterator<String> keyIt = keySet.iterator();
		
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			
			System.out.println(key);
			System.out.println(value);
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<E> entryIt = entrySet.iterator(); 
		
	}
}
