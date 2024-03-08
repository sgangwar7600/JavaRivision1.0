package controlstatementstypes.jumpstatementtypes;

/** 

-- the break statement is used to break the current flow of the program
   and transfer the control to the next statement outside a loop or switch statement

-- However, it breaks only the inner loop in the case of the nested loop.

-- The break statement cannot be used independently in the Java program, i.e., it can only be written inside the loop or switch statement.

-- if we want to break terminate nested loop according to our needs , then we can use labeled break statement
 

**/

public class Break {

	public static void main(String[] args) {

		for (int i = 1 ; i<10 ; i++) {
			
			if (i==3) 
			{ 
				break;
				// System.out.println(i); -- you can not provide any statement after the break; statement	

			}
			System.out.println(i);	
		}
		System.out.println("outside of for loop");	

	}

}

/** 
 
 -- if we want to break terminate nested loop according to our needs , then we can use labeled break statement
 
	example:-
	
	
	:  this symbol use for loop labels
	
	public class LabelledBreak
			
			{
				public static void main(String... ar)
						
					{

					int i=7;

						loop1:
							while(i<20)
								{	
							if(i==10)
								
								break loop1;
						
							System.out.println("i ="+i); 
							i++;
						}
				
				System.out.println("Out of the loop");
				
				} //main method ends
				
				} //class ends

**/