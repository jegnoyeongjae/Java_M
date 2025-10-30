package day1028;


//builder와 buffer는 동기화의 지원유무 차이
public class StringBuffer1 {
	public static void main(String[] args) {
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		sb.append("StringBuffer");
		sb.append(".");
		sb.append("Hello Java");
		
		
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer();
		
		sb2.append("java");
		System.out.println(sb2);
		System.out.println(sb.append(sb2));
		sb2.insert(1, "@");
		System.out.println(sb2);
		
		
	}
}
