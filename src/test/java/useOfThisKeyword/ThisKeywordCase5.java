package useOfThisKeyword;

//use 5 : this keyword can be used to pass as an argument in the constructor call

class Tesst {
	
	Tesst(ThisKeywordCase5 TD) {
		System.out.println("test class constructor");
	}
}


public class ThisKeywordCase5 {

	void m1() {
		
		Tesst nn = new Tesst(this);
		
	}
	
	
	public static void main(String[] args) {

		ThisKeywordCase5 mm =  new ThisKeywordCase5();
		mm.m1();
	}

}
