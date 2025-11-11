package day1106;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BankMain2 {

	public static void main(String[] args) throws IOException, InterruptedException {

			
			
			// 파일 객체 생성
			File file = new File("account.txt");
			
			// 파일리더 객체 생성
			FileReader fr = new FileReader(file);
			
			int ch;
			// 파일의 내용 읽어오기
			while((ch= fr.read()) != -1) {
				System.out.print((char)ch);
				Thread.sleep(200);
			}
			fr.read();
			
			// 연결종료
			fr.close();
	}

}
