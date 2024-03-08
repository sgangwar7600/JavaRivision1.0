package controlstatementstypes.iterationstatementtypes.whilelooptypes;

/**

-- if while loop is infinite and and we provide any expression
--after while loop then it will provide compile time error saying "unreachable statement"


**/

public class WhileLoopType2 {

	public static void main(String[] args) {


		while(true) {
			
			System.out.println("this loop keep going on infinite time");
		}
	}

}
