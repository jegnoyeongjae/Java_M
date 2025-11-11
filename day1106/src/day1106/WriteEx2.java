package day1106;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteEx2 {
	public static void main(String[] args) throws IOException {
		FileOutputStream os = new FileOutputStream("src/files/test2.db");
		
		byte[] arr = {10,20,30,40,50};
		
		
		
		os.write(arr,1,3);
		
		os.flush();
		
		os.close();
	}
}
