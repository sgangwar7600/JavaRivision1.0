package controlstatementstypes.selectionstatementtypes;

//Note – If the inner condition satisfies then only outer if will be executed.
//Along with if conditions we can write else conditions also.

public class NestedIfCase2 {

	public static void main(String args[]) 
		
	{ 

		int a=10; 
		int b=20; 
		
		if(a==10){ 

			if(b!=20){ 
				System.out.println("GeeksforGeeks"); 
			} 
			
			
			else{ 
				System.out.println("GFG"); 
			} 
		} 
	} 
} 