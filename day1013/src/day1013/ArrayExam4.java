package day1013;

public class ArrayExam4 {
	public static void main(String[] args) {
		int[][ ] arr1 = new int [][] {{10,20,30},{1,2,3}};
		
		int[][ ] arr2 = {{10,20,30,40},{1,2,3,4}};
		
		int [][] arr4 = {
										{11,12,13,14,15},
										{1,2,3,4,5},
										{47,48,49},
										{100,200,300}
		};
		
		System.out.println(arr4[2][2]);
		System.out.println(arr4.length);
		System.out.println(arr4[3].length);
		
		for(int i = 0; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.printf("arr4[%d][%d] = %d / ",i,j,arr4[i][j]);
			}
		}
	}
}
