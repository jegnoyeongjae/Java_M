package day1103;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		map.put(59, "kim");
		map.put(75, "jung");
		map.put(96, "park");

		// 1. entrySet() : key와 value를 가져올 때 사용
		System.out.println("1. entrySet() ============ ");
		map.entrySet();
		/*
		 * Set<Map.Entry<Integer, String>> entry = map.entrySet();
		 * 
		 * for(Map.Entry<Integer,String> e: entry) { System.out.println(e.getKey() +"/"+
		 * e.getValue()); }
		 */

		for (Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		
		// 2. keySet() :  key를 가져올 때 사용
		System.out.println("2. keySet() ===================");
		
		for (Integer i  : map.keySet()) {
			System.out.println(i+ "/" + map.get(i));
		}
		
		// 3. Iterator ~ entrySet()
		
		System.out.println("3. entrySet() ===================");
		// Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		// Iterator<Map.Entry<String, Integer>> entry = entrySet.interator();  위 두줄을 요약한게 아래 한줄
		Iterator<Map.Entry<Integer, String>> entry = map.entrySet().iterator();
		
		while(entry.hasNext()) {
			Map.Entry<Integer, String> e = entry.next();
			System.out.println(e.getKey() + "/" + e.getValue());
		}
		
		// 4. Iterator  ~ keySet();

		System.out.println("4.  IteratorSet() ===================");
		
		Iterator<Integer> keyIt = map.keySet().iterator();
		
		while(keyIt.hasNext()) {
			int key  = keyIt.next();
			System.out.println(key+"/"+ map.get(key));
		}
	}
}
