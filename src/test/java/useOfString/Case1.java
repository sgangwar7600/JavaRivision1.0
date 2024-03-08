package useOfString;

/***		syntax:- <String_Type> <string_variable> = "<sequence_of_string>"; 

- String - A String variable contains a collection of characters surrounded by double quotes

- String literal -  To make Java more memory efficient (because no new objects are created)
  	
- Using new keyword - In such a case, JVM will create a "new string object" in normal (non-pool) heap memory and 
 						the literal “Shashikant” will be placed in the string constant pool also so more memory will be occupy.
 						
-  The Java String is immutable which means it cannot be changed. Whenever we change any string, a new instance is created. For 
		mutable strings, you can use StringBuffer and StringBuilder classes.
 
 ***/
public class Case1 {

	public static void main(String[] args) {

		
					//String str = new String();   or
					
					
					String s = "Gangwar" ;
					
					String newS = s.concat(" Shashikant");
					
					System.out.println(s);
					
					System.out.println(newS);
	}

}
