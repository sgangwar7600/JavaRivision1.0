package inherianceTypes;


class CCC  {
	
	void methodCCC() {
		
		System.out.println("this is methoddCC");
	}
}

class BBB extends CCC {
	
	void methoddBBB() {
		
		System.out.println("this is methoddBB");
	}
}



public class HierarchicalInheritancee extends CCC {

	void methoddAAA() {
		
		System.out.println("this is methoddAA");

	}
	
	public static void main(String [] args) {
		
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		HierarchicalInheritancee aaa = new HierarchicalInheritancee();   //making object of a class
		aaa.methoddAAA();
		aaa.methodCCC();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		CCC ccc = new CCC();  //making object of c class
		ccc.methodCCC();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		BBB bbb = new BBB();  // making object of b class
		bbb.methoddBBB();
		bbb.methodCCC();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

	}
}
