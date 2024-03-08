package useOfString;

/***

String 										StringBuffer

The String class is immutable.				The StringBuffer class is mutable. allowing modifications like additions, deletions, and alterations without creating new objects each time




***/
public class StringBufferobject {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer("Shashikant Gangwar");
		
		System.out.println(str1.charAt(6));
		
		System.out.println(str1.capacity());
		
		System.out.println(str1.isEmpty());

		System.out.println(str1.length());

		System.out.println(str1.reverse());


						
	}

}
