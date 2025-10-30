package day1013;

import java.util.Arrays;

public class ArrayExam2 {
	public static void main(String[] args) {
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<10; i++) {
			int r = (int)(Math.random()*10);
			int temp  = numArr[i];
			numArr[i] = numArr[r];
			numArr[r]=temp;
		}
		System.out.println(Arrays.toString(numArr));
		System.out.println("____________________________________");

		
		int[] numArr1 = {0,1,2,3,4,5,6,7,8,9};
		for(int i=0; i<10; i++) {
			int r = (int)(Math.random()*10);
			int temp  = numArr1[0];
			numArr1[0] = numArr1[r];
			numArr1[r]=temp;
		}
		System.out.println(Arrays.toString(numArr1));
		
	}
}
