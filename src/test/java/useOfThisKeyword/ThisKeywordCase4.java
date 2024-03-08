package useOfThisKeyword;

// use4:- this keyword can be used to pass an argument in method call


class thisdemooo {
	
	void method1(thisdemooo td) { System.out.println("m1");};
	
	
	void method2() {
		method1(this);
		
	}
}

public class ThisKeywordCase4 {

	public static void main(String[] args) {
		
		
		thisdemooo nn = new thisdemooo();
		nn.method2();
	}
}
