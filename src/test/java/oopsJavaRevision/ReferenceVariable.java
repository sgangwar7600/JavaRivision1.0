package oopsJavaRevision;

public class ReferenceVariable {

	//instance variable
	String color ;
	int age;
	
	public static void main(String [] args) {
	
		
	ReferenceVariable dog = new ReferenceVariable(); //object of main class so that we can access the 
	dog.color = "White";							//	reference variables of main class and able to initialize the object by reference variable
	dog.age = 11;

	System.out.println(dog.color + " " + dog.age);
	
	}
	 
}
