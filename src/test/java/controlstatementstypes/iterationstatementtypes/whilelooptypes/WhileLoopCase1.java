package controlstatementstypes.iterationstatementtypes.whilelooptypes;

/**

-- when we don't know how many time the loop is going to run,
then in that case we use while loop

**/

public class WhileLoopCase1 {

	public static void main(String[] args) {

		
		int no  = 538 ;
		
		int leng = 0;
		
		while ( no != 0) {
		
			leng = leng + 1 ;			

			no = no/10 ;
			
		}
		
		System.out.println(leng);
	}

}
