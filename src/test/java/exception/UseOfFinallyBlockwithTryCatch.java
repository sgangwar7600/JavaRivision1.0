package exception;

import java.io.FileInputStream;
import java.io.IOException;

// finally block is which always executes after try or catch block 
// it contains resource closing code - for example database connection, reading and writing fro file etc.

public class UseOfFinallyBlockwithTryCatch {

	static FileInputStream r;
	
	public static void main(String[] args) {

		try {
		 
			r = new FileInputStream("C:\\Users\\Shashikant\\OneDrive\\Desktop\\configtxt.txt");
		int o = r.read();
		System.out.println(o);
				 
		}
		catch(IOException i) {
			System.out.println(i);
		}
		finally {
			
			try {
			r.close();
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

}
