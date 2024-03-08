package objecttypecasting;


// Definition : -  here when we define parent class as reference type and child class object type while making object then
// it is called Up-casting

class A {
							void mn() {  			System.out.println("paarent class");}
}

class B extends A {		
							void mn() {				System.out.println("child class");} 

}


public class ObjectUpCasting {

	public static void main(String[] args) {


				// object up-casting example
		
				A r = new  B();			// type-casted from child object to parent object
				r.mn();
	}

}
