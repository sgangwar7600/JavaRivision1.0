package superKeywordTypes;

// use 2: super keyword can be used to invoke immediate parent class method

class AAA {
	
	void methodA () {
		System.out.println("i'm class A");
	}
}
public class superKeywordCase2 extends AAA {

	void methodA() {
		
		System.out.println("i'm in class B");
	}
	
	void methodB() {
		
		methodA();
		super.methodA();
	}
	
	
	public static void main(String[] args) {

		superKeywordCase2 n = new superKeywordCase2();
		n.methodB();
	}

}
