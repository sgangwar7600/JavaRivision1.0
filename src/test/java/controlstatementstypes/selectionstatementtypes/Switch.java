package controlstatementstypes.selectionstatementtypes;

// The break and default keywords are optional, and will be described later in this chapter
// When Java reaches a break keyword, it breaks out of the switch block.
// This will stop the execution of more code and case testing inside the block.
// When a match is found, and the job is done, it's time for a break. There is no need for more testing.
// The default keyword specifies some code to run if there is no case match:
// There can be one or N number of case values for a switch expression.

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		

		int a = 20; int b= 10; String ch;
		
		System.out.println("enter user choice  \n");
		Scanner r = new Scanner(System.in);
		ch = r.nextLine();
		
		switch(ch) {
		
		case "sum" : System.out.println("sum is : " + (a+b));
		break;
			
		case "sub" : System.out.println("sub is : " + (a-b));
		break;
			
		case "multi" : System.out.println("multi is " + (a*b));
		break;
			
		case "div" : System.out.println("div is " + (a/b));
		break;
			
			default : System.out.println("Invalid choice");
				break;
		
		}
	}

}
