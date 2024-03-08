package wrapperclass;


public class WrapperClasss {

	public static void main(String[] args) {

		int x = 10 ;	//primitive
		Integer obj = Integer.valueOf(x);		 //primitive to object  //boxing 
		System.out.println(obj);
		
		
		Integer a = new Integer(1000);		
		int i = a.intValue();              // obj to primitive  //unboxing
		System.out.println(i);
		
	}

}


/**

The wrapper class in Java is used to convert primitive data types into objects or
Java Wrapper classes wrap the primitive data types, that is why it is known as wrapper classes or
Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects. or

**********Primitive Data Types and their Corresponding Wrapper Class****

Primitive Data Type		|			Wrapper Class

char                   	|           Character                              

byte					|			Byte

short					|			Short

int 					|			Integer

long					|			Long

float					|			Float

double					|			Double

boolean					|			Boolean


********* useful methods of wrapper class
	
	--- valueOf()
	---	parseXxx()
	--- xxxValue()
	
	The wrapper class implements the technique to convert the primitive into object and object into primitive. There is a 
	concept of autoboxing and unboxing in the wrapper class, which transform the primitives into objects and objects into 
	primitives automatically.
	
	
	Why should we use wrapper classes instead of primitives? ---- Wrapper classes help the Java program be completely 
	object-oriented whereas primitive data types help in the simple declaration of values with variables.It is because of 
	the additional features being there in the Wrapper class over the primitive data types when it comes to usage. These 
	methods include primarily methods like valueOf(), parseInt(), toString(), and many more.

**/


