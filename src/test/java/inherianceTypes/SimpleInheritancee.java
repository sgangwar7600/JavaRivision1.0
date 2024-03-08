package inherianceTypes;


// this relationship is also called IS-A relationship
// use: code re-usability
// Disadvantage : tightly couple 


public class SimpleInheritancee extends secondClass {

	public static void main(String [] args) {
		
		
			secondClass obj = new secondClass();
			obj.eat();
	}
}

class secondClass{
	
	void eat() {
		
		System.out.println("dog can eat");
	}
	
}
