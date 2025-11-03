package day1103;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(59, "kim");
		treeMap.put(75, "jung");
		treeMap.put(96, "park");
		treeMap.put(37, "oh");
		treeMap.put(87, "choi");
		treeMap.put(12, "lee");
		treeMap.put(80, "no");
		
		
		// ceilingEntry : 지정한 값보다 크거나같은 값중에서 가장 근사치에 가까운 키의 엔트리
		System.out.println("ceilingEntry(): " + treeMap.ceilingEntry(80));
		
		// ceilingKey : 지정한 값보다 크거나 같은 값중에서 가장 작은 키를 반환
		System.out.println("map.ceilingKey(80) " +  treeMap.ceilingKey(80));
		
		// 지정한 키 값보다 작거나 같은 값중에서 가장 큰 키의 값을 반환
		System.out.println("map.floorKey(80) " + treeMap.floorKey(80));
		
		// map.replace(기존키, 변경할 값) : 기존 키의 값을 지정한 값으로 변경
		System.out.println("replace: "+ treeMap.replace(75, "pi"));
		System.out.println("replace: "+ treeMap.get(75));
		
		// values(): 모든 값을 출력
		System.out.println("allValue:  "+ treeMap.values());
		
		Map.Entry<Integer, String> entry = null;
		
		// fistEntry(): TreeMap에 저장된 첫번째(트리맵은 정렬되기 때문에 첫번째 = 가장 작은 값이다.) 키와 값의 쌍을 반환
		entry = treeMap.firstEntry();
		System.out.println("first " + entry.getKey() + "/"+ entry.getValue());
		
		// lastEntry(): TreeMap에 저장된 마지막(= 가장큰) 키와 값의 쌍을 반환
		entry = treeMap.lastEntry();
		System.out.println("last " +  entry.getKey() + "/"+ entry.getValue());
		
		// lowerEntry() : 지정된 키 값보다 작은 키중에서 가장 큰 키의 키와 값을 출력;
		entry = treeMap.lowerEntry(90);
		System.out.println(entry.getKey() +"/"+ entry.getValue());
		
		
		while(!treeMap.isEmpty()) {
			// pollFirstEntry(); : map에서 제일 작은 키를 제거하면서 반환
			entry = treeMap.pollFirstEntry();
			System.out.println(entry.getKey() +"/"+ entry.getValue());
			System.out.println("남은객체수: "+treeMap.size());
		}
		
	}
}
