package constructorTypes;

public class DefaultConstructorWithNoArgument {

	//here we are learning about default constructor , in this, we are getting values of instance variable in print(output)
	// without assigning any value to instance variable because here compiler making itself a default constructor 
	
	//instance variable
	int i;
	String name;
	int rollno;
	
	public static void main(String[] args) {
		
		DefaultConstructorWithNoArgument defaultCons = new DefaultConstructorWithNoArgument();
		
		System.out.println(defaultCons.i + " " + defaultCons.name + " " + defaultCons.rollno );
	}
	
}
