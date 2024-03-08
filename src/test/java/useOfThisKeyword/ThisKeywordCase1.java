package useOfThisKeyword;

//first use: this keyword is used to invoke current class instance variable
// when you provide the same name for instance variable and local variable then it will give default value of integer so always have a differ name for both instance variable and local variable
class Test{
	
	int i;  // instance variable name
	
	void method(int i) {
		
	this.i=i;
		
	} 
	
	void show() {
		
		System.out.println(i);

	}
};
public class ThisKeywordCase1 {

	public static void main(String[] args) {
		
		Test n = new Test();
		n.method(10);
		n.show();
	}
}

