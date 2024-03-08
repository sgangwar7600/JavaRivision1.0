package polymorphismTypes;

class P {
									void f() {  System.out.println("base class");}
}

class Q extends P {
									void f() {	System.out.println("inherited parent class");}
}

class R extends Q {
									void f() { System.out.println("inherited child class");}
}


public class MethodOveridingCase3 {

	public static void main(String[] args) {

	
		//here when we define parent class as reference type and child class object type while making object then

			P rr = new Q();
			rr.f();
		
			//here when we define parent class as reference type and child class object type while making object then

			P rrr = new R();
			rrr.f();
			
			
	}

}
