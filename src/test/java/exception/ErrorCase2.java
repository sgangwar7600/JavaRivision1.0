package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorCase2 {

	public static void main(String[] args) {

		try 
		{
		FileInputStream r = new FileInputStream("C:\\Users\\Shashikant\\OneDrive\\Desktop\\configtxt.txt");
		int k = r.read();
		System.out.println(k);
		}
		
		catch(FileNotFoundException i) 
		{
			
			System.out.println(i);
		}
		catch(IOException e ) 
		{
			System.out.println("absolute beginner");
		}
		
		
		
	}

}
