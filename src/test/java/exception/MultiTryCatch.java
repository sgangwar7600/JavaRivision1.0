package exception;


public class MultiTryCatch {

	public static void main(String[] args) {

		try {
			
		System.out.println(100/2);
		int[] a = {10, 20 , 30, 40};
		
		System.out.println(a[5]);
		
		} 
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		
	}

}
