package day1013;

import java.util.Arrays;

public class ArrayExam5 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int[] count = new int[10];
		for (int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*(10));
		}
		System.out.println(Arrays.toString(num));
		
		for(int i=0;i<num.length;i++) {
			count[num[i]]++;
		}
		for(int i =0; i<num.length;i++) {
			System.out.println(i+"의 개수 : "+count[i]);
		}
	}
}
