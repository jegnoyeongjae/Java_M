package day1106;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx3 {
	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("src/files/test3.db");
		
		byte[] arr = {10,20,30};
		
		
		
		os.write(arr);
		
		os.flush();
		
		os.close();
	}
}
