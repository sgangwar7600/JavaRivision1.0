package useOfString;

/***
 
  == :- use for reference comparison or address comparison
  
  equals :- use for content or value comparison
 
***/

public class EqualMethod {

	public static void main(String[] args) {


		String str1 = "Shashikant Gangwar";

		String str2 = "Shashikant Gangwar";
		
		boolean eql = str1.equals(str2);
		
		System.out.println(eql);    // true
		
		System.out.println(str1==str2);  // true - i am not sure about it
		
		
//********************************************************************************		
	
		
		String str3 = new String("Shashikant Gangwar");
		
		String str4 = new String("Shashikant Gangwar");

		System.out.println(str3==str4);   // false 

	}

}
