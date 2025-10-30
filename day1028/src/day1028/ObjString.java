package day1028;

public class ObjString {

	public static void main(String[] args) {

		byte[] bytes = {62,25,13,47,54,65,72,81,19,11,23,43,55};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		
		
	}

}
