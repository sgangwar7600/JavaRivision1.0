package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorCase1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {


		FileInputStream r = new FileInputStream("C:\\Users\\Shashikant\\OneDrive\\Desktop\\configtxt.txt");
		int i = r.read();
		System.out.println(i);
		
		
	}

}
