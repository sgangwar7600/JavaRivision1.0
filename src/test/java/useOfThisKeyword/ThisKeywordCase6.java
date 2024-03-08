package useOfThisKeyword;

//use 6 : this keyword can be used to return the current class instance from the method

public class ThisKeywordCase6 {

	ThisKeywordCase6 m1() {
		
		return this;
	}	
	
	
	
	public static void main(String[] args) {

		ThisKeywordCase6 n = new ThisKeywordCase6();
		n.m1();
	}

}
