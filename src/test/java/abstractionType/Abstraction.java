package abstractionType;

abstract class Vehical {  // this is base class
	
	abstract void start();
}

class car extends Vehical {
	
	void start() { 
		System.out.println("car start with key");
		}
}


public class Abstraction {

	void start() { System.out.println("scooter start with kick");}
	
	public static void main(String[] args) {
		
// here when we define parent class as reference type and child class object type while making object then
	
		Vehical r = new car();   // object up-casting
		r.start();
		

	}
}
