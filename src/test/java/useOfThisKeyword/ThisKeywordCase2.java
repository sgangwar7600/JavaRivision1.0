package useOfThisKeyword;

//this keyword can be used to invoke current class method(implicitly)

class thisdemo {
	
	void demo() { System.out.println("thisdemo");}


	void show() {
				
		System.out.println("before show");
		
		//this.show(); can't write
		this.demo(); // or demo();  both will work
		
		System.out.println("after show");
	}
	
	
}

public class ThisKeywordCase2 {

	public static void main(String[] args) {
		
		thisdemo kk =  new thisdemo();
		kk.show();
	}
}
