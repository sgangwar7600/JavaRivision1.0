package exception;


import java.sql.Connection;
import java.sql.DriverManager;

public class TryWithResourceCase2 {

	public static void main(String[] args) {

		try(  		Connection con = DriverManager.getConnection("","","");  ) 
		{
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
