package day1106;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BankMain {

	public static void main(String[] args) throws IOException {

			BankAccount a = new BankAccount("kim", "123-1122330", 102012000);
			BankAccount b = new BankAccount("no", "456-4455660", 102012000);
			
			System.out.println(a);
			System.out.println(b);
			
			File file =  new File("account.txt");
			
			FileWriter fw =  new FileWriter(file);
			
			fw.write(a+"\n");
			fw.write(b+"\n");
			
			fw.close();
			
	}

}
