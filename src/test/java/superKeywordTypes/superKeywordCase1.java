package superKeywordTypes;

// use: super keyword refers to the immediate parent class instance variable

class A {
	
	int i = 10;
}

public class superKeywordCase1 extends A {

	int i =20;
	
	void show(int i) {
		
		System.out.println(super.i);	//30
		System.out.println(this.i);		//20
		System.out.println(i); 			//10
	}
	
	
	public static void main(String[] args) {

		superKeywordCase1 n = new superKeywordCase1();
		n.show(30);
	}

}
