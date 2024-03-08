package superKeywordTypes;

// use 3: super() keyword can be used to invoke immediate parent class constructor

class AAAA{
	
	AAAA() { System.out.println( "I'M IN 1");}
	
}
public class superKeywordCase3 extends AAAA {

	superKeywordCase3(){
		
		super();
		
		System.out.println("I'M IN 2");
	}
	public static void main(String[] args) {
		
		superKeywordCase3 n = new superKeywordCase3();
		
	}
}
