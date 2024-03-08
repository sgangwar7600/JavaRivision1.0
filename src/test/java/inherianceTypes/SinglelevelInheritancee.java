package inherianceTypes;

class B {
	
	void methoddB() {
		
		System.out.println("class B with methoddB");
	}
	
}


public class SinglelevelInheritancee extends B {

	public static void main(String [] args) {
		
				B inh = new B();
				inh.methoddB();
				
				SinglelevelInheritancee inh1 = new SinglelevelInheritancee();
				inh1.methoddC();
		
	}
	
	void methoddC() {
	
		System.out.println("this is methodC");
		
	}
}
