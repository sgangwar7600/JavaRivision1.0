package useOfThisKeyword;

// use3: this() keyword can be used to invoke current class constructor 

class thisdemoo {
	
	thisdemoo() {
			
		System.out.println("name is too big boy");
	};
	
	thisdemoo(int a) {

		this();
		
		System.out.println("second cons");
		
		
	}
}

public class ThisKeywordCase3 {

	public static void main(String[] args) {

		thisdemoo n = new thisdemoo(10);
		
		
	}

}
