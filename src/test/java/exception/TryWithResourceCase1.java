package exception;

import java.io.FileInputStream;

// Here we are using "Try with Resources" instead of finally block 

public class TryWithResourceCase1 {
	
	
	public static void main(String[] args) {

		try ( FileInputStream 	r = new FileInputStream("");) // here JVM automatically close the resources 
		
		{
		r.read();
		
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
		
				
	}
}
