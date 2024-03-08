package exception;

// throw keyword is used for user defined exception

class  InValidAgeException extends Exception {
	
	InValidAgeException(String msg) {
		
		System.out.println(msg);
		}	
}
public class ThrowUseCase2 {
	
	public static void main(String[] args) throws InValidAgeException {


		int age = 18 ;
		
		ThrowUseCase2 k = new ThrowUseCase2();
		k.checkAge(age);
		
	}
	
	void checkAge(int age) throws InValidAgeException {
		
		if(age<=17) {
			
			System.out.println("you can vote");
		}
		
		else {
		throw new InValidAgeException("You can not vote");   // User-defined Exception
		}
	}

}
