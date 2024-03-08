package typecastingg;


/** ExplicitTypeCasting :- convert higher data type to lower data type
 
 it's called as narrowing type casting, downcasting,manual typecasting
 
 short = 2 byte	|	float  = 4 byte		|	char = 2 byte	boolean = 1 bit
 int   = 4 byte	|	double = 8 byte		|
 long  = 8 byte	|						|

**/

public class ExplicitTypeCasting {

	public static void main(String[] args) {

		//we have to use cast operator for narrowing casting


		long a = 1000L;
		int b = (int)a;
		System.out.println(b);
		
	}

}
