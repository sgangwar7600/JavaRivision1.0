package constructorTypes;


//single this refer to the object 
//(this.i) keyword refer/point to the current class instance variable because instance variable is for instance


public class ThisKeyword {

	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.setValues(10);
		t.show();
	}

}

class Test {
	
	int i;
	
	void setValues(int i) {
		
		//instance variable = local variable
		this.i = i;
	}
	
	void show() {
		System.out.println(i);
	}
}