package finalKeywordTypes;

// case 1 : when we want that the value of variable keep constant throughout the program then we make the variable final


public class FinalKeywordCase1 {
	 
	public static void main(String[] args) {

		final int i = 10;
		 
		// i = i+20; this will give error
		
		System.out.println(i);
	}

}
