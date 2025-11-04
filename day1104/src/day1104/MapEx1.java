package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		String[] data = {"A","K","A","D","B","C","C","E","C","E"};
		
		Map map = new HashMap();
		
		for(int i = 0; i<data.length; i++) {
			// 알파벳(키) 존재하면
			if(map.containsKey(data[i])) {
				// 개수를 가져와서 1을 증가한 값으로 덮어씌우기
				int value = (int) map.get(data[i]);
				map.put(data[i], value+1);
			}else {
				// 알파벳이 존재하지 않으면 개수를 1로 설정
				map.put(data[i], 1);
			}
		}
		Set set = map.entrySet();
		Iterator it = set.iterator();
				
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = (int) entry.getValue();
			System.out.println(entry.getKey() + " :  " + value);
		}
	}
	public static String printBar (char data, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++) {
			bar[i] = data;
		}
		return new String(bar);
	}
}
