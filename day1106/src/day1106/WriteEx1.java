package day1106;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("src/files/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush();
		
		os.close();
	}
}
