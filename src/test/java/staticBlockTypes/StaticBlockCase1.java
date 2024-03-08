package staticBlockTypes;


// before 1.6 version of java, static block was working without main method but after 1.6 version of java, it is mandatory to mention main method then only static block can work
// first static block will work then only main method will work
// static block call automatically 
// we can make multiple static block, and they will run top to bottom
// first use:- static block executed at class loading, hence at the time of class loading if we want to perform any activity, we have to define that inside static block, for example native methods - you can write a code of loading of native method this is first use
// second use:- we can initialize the static members inside static block

public class StaticBlockCase1 {

	static { 		System.out.println("first static block");	 }	
		
	public static void main(String[] args) {
		
		System.out.println("i am in main method");
	}
		
}
	
