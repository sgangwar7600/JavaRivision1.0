package controlstatementstypes.iterationstatementtypes.DoWhileTypes;

import java.util.Scanner;

// WAP to reverse a number

public class DoWhileType2 {

	public static void main(String[] args) {
		
		int a; int b; String operationInput,PressYesAndNo  ;
		
		
		Scanner r = new Scanner(System.in);
		
		do {
		System.out.println("enter user first number  ");
		a = r.nextInt();
		
		System.out.println("enter user second number  ");
		b = r.nextInt();
		
		System.out.println("enter user choice  ");
		operationInput = r.next();
		
		System.out.println("do you want to continue the (press Y or y and any keyword  for no)");
		PressYesAndNo = r.next();
		
		switch(operationInput) 
		
		{
		
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
		
		while(PressYesAndNo.equals("y") || PressYesAndNo.equals("Y"));

}}
