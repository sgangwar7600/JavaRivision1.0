package exception;


// if a programmer want to create an exception itself then he can
// "throw" keyword

// we use for only exception defining,  not for handling

// for handling , we use try catch 

// mainly use for "User-Defined Exception" or manually defined Exception

// syntax : throw new ExceptionClassName("");

class InvalidAgeOfWatchMovie extends Exception {
	
	InvalidAgeOfWatchMovie(String i) {
		System.out.println(i);
	}
}
public class ThrowCase1 {

	static int age = 18;
	
	public static void main(String[] args) throws InvalidAgeOfWatchMovie   {

		ThrowCase1 rr = new ThrowCase1();
		
		if(age<=18) {
			
			System.out.println("he can watch Movie");
			
		} 
		
		else {
			
			// pre-define exception
			throw new InvalidAgeOfWatchMovie ("he can not watch Movie");
		}
	}

}
