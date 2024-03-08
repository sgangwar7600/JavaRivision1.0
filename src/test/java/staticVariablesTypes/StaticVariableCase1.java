package staticVariablesTypes;

// only class level variables/instance variables are static variables , you can not make under the methods or can not use with local variables
// static means memory management , because we do not need to make object while having static variables, we can call static variables without making objects, and the less object , also it takes less memory
class X {
	
	static int a = 10;
}

public class StaticVariableCase1 {
	
	public static void main(String[] args) {

		//StaticVariableCase1 n = new StaticVariableCase1();
	
		System.out.println(X.a);
	}

}
