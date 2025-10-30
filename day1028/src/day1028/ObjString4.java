package day1028;

public class ObjString4 {

	public static void main(String[] args) {

		int iVal = 100;
		String strVal = String.valueOf(iVal); 
		
		
		double dVal = 200.0;
		String strVal2 = String.valueOf(dVal);
		
		System.out.println(iVal+dVal);
		
		System.out.println(strVal+strVal);
		
		double sum = Integer.parseInt(strVal) + Double.parseDouble(strVal2);
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		
		System.out.println(sum);
		System.out.println(sum2);
	}

}
