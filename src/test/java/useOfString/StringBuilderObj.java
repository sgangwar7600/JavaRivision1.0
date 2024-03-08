package useOfString;

/***		StringBuffer Class							StringBuilder Class

--  StringBuffer is present in Java.					--  StringBuilder was introduced in Java 5 

--  StringBuffer is synchronized. 						--  StringBuilder is asynchronized. This means 
	This means that multiple threads cannot 				that multiple threads can call the methods of StringBuilder simultaneously.
	call the methods of StringBuffer simultaneously.
	
-- Due to synchronization, StringBuffer is called 		--	Due to its asynchronous nature StringBuilder is not a thread safe class.
	a thread safe class.	
	
-- Due to synchronization, StringBuffer is lot slower	--	 Since there is no preliminary check for multiple threads, StringBuilder
	than StringBuilder.										 is a lot faster than StringBuffer.

***/
public class StringBuilderObj {

	public static void main(String[] args) {


			StringBuilder sb = new StringBuilder("Shashikant");
			
			System.out.println(sb.reverse());
			
			System.out.println(sb.capacity());

			
			System.out.println(sb.charAt(6));

			
			System.out.println(sb.isEmpty());

			
			System.out.println(sb.length());
			


	}

}
