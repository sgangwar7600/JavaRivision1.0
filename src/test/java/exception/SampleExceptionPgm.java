package exception;

public class SampleExceptionPgm {

	static int a = 10;
	static int b = 0 ;
	
	
	public static void main(String[] args) throws ArithmeticException {
			
		try {
			
			
			int c= a/b;
			
			System.out.println(c);
			
			}
			
			catch(Exception e) {
				
				System.out.println(e);
			}		
		}

}
