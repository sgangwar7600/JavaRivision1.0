package typecastingg;


/** ImplicitTypeCastingCase :- convert lower data type to higher data type
 
 it's called as widening type casting, upcasting, primitive datatype typecasting
 automatic typecasting
 
 short = 2 byte	|	float  = 4 byte		|	char = 2 byte	boolean = 1 bit
 int   = 4 byte	|	double = 8 byte		|
 long  = 8 byte	|						|

**/
public class ImplicitTypeCastingCase {

	public static void main(String[] args) {
		
		
		//TypeCastingCase1 n = new TypeCastingCase1();
		
		int x = 10;    // 4 byte
		long y = x;		// 8 byte
		System.out.println(y);
		
		
		
	}
}
