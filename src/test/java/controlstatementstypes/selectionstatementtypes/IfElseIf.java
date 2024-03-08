package controlstatementstypes.selectionstatementtypes;

public class IfElseIf {

	public static void main(String[] args) {


		int a = 1729 ;
		
		int b = 17299 ;
		
		if (b>a) {
			
			System.out.println("b is greater than a");
		}
		
		else if (a>b) {
			System.out.println("a is greater than b");
		}
		
		else if(a==b) {
			
			System.out.println("a is equal to b");
		}
		
		else {
			
			System.out.println("none of condition is true");
		}
		
	}

}
