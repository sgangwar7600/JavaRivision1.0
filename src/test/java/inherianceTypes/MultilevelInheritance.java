package inherianceTypes;


class BB {
	
	void methoddBB() {
		
		System.out.println("this is methoddBB");
	}
}

class CC extends BB {
	
	void methodCC() {
		
		System.out.println("this is methoddCC");
	}
}

public class MultilevelInheritance extends CC {

	void methoddAA() {
		
		System.out.println("this is methoddAA");

	}
	
	public static void main(String [] args) {
		
		
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		MultilevelInheritance aaa = new MultilevelInheritance();   //making object of a class
		aaa.methoddAA();
		aaa.methoddBB();
		aaa.methodCC();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		CC ccc = new CC();  //making object of c class
		ccc.methodCC();
		ccc.methoddBB();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		BB bbb = new BB();  // making object of b class
		bbb.methoddBB();
		
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

	}
}
