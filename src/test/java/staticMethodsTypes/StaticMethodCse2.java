package staticMethodsTypes;

//static method belong to the class , not to the objects
//a static method can be accessed directly by the class name and doesn't need any object'
//a static method can access only static data. it cannot access non-static data(non-static instance data)
//a static method can call only other static methods and cannot call a non-static method
//a static method cannot refer to "this" or "super" keyword in anyway

 class Tesla { 
	
	static int num; 
	static String Name; 

	static void display(int num, String Name) 
	{ 
		System.out.println("static number is " + num + "......static name : " + Name ); 
	} 
 }

public class StaticMethodCse2 {

	public static void main(String[] args) {

		Tesla.display(1729, "Sir Nikola");
		
	}
}

/*

								Difference Between the static method and instance method

Instance Methods        								|  		Static Methods
It requires an object of the class.						|		It does not require an object of the class.
It can access all attributes of a class.				|		It can access only the static attribute of a class.
The methods can be accessed only using object reference.|		The method is only accessed by class name.
Syntax: Objref.methodname()								|		Syntax: className.methodname()
It’s an example of pass-by-value programming.			|		It is an example of pass-by-reference programming.
  
  */