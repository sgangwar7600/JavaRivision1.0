package constructorTypes;

class SuperKeyword extends B {

	int i = 20;
	
	
	void show(int i) {
		System.out.println("for single i output--------" + i);
		System.out.println("for this keyword output----" + this.i);
		System.out.println("for super keyword output---" + super.i);

	}
	
	public static void main(String [] args) {
		
		SuperKeyword obj = new SuperKeyword();
		obj.show(30);
	}
}

class B {
	
	int i = 10 ;
	
	
}
