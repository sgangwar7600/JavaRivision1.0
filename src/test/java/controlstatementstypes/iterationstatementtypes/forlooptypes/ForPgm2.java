package controlstatementstypes.iterationstatementtypes.forlooptypes;

import java.util.Scanner;

// Write a program to find the factorial

public class ForPgm2 {
	public static void main(String[] args) {

		long fact = 1;
		long number;
		
		System.out.println("insert number for the factorial  :-  ");
		Scanner r = new Scanner(System.in);
		number = r.nextInt();
		
		
		
		for (long i = 1; i<=number ; i++) {
			
			fact = fact*i ;	
		}
		System.out.println("fact of " + number + "  is  " +fact);

	}
	
	

}
