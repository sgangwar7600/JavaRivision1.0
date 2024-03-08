package finalKeywordTypes;

// case 2: when we want that our final method can not be  then we make it final method 

class Demo {
	
	//final void m1() {
		 void m1() {
		System.out.println(" i am in demo class");
	}
}

public class finakKeywordCase2 extends Demo {

	void m1() {
		System.out.println(" i am in test class");
	}
	
	public static void main(String[] args) {


	}

}
