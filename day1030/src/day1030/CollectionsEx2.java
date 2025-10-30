package day1030;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsEx2 {
	public static void main(String[] args) {
		ArrayList lot = new ArrayList();
		
		for (int i =1; i <=45; i++) {
			lot.add(i);
		}
		Collections.shuffle(lot);
		
		int[] number = new int[6];
		
		System.out.println(number.length);
		System.out.println(number[1]);
		
		for(int i=0; i<number.length; i++) {

			
			number[i] = (int) lot.remove(0);
			
			
		}
		
		System.out.println(lot);
		
		System.out.println(number[1]);
	}
}
