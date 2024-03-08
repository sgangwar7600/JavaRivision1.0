package polymorphismTypes;

// this is base class or reference class
class Srinivasa {
											void Tesla(int a ) {
												System.out.println("Srinivasa class method with his fav number" + a);
											}
}

// this is child class
class Ramanujan extends Srinivasa {				void Tesla(int a ) {
												System.out.println("Ramanujan child class method with his fav number :- " + a);	
}
}

public class MethodOveridingCase4 {

	public static void main(String[] args) {

		//here when we define parent class as reference type and child class object type while making object then

		Srinivasa ee = new Ramanujan();
		ee.Tesla(1729);
	}

}
