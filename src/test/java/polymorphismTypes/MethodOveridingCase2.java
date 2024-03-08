package polymorphismTypes;


class X {
				void m() {
					
					System.out.println("parent class");
				}
}


class Y extends X {
				void m() {
				
					System.out.println("child class");
				}
}


public class MethodOveridingCase2 {

	public static void main(String[] args) {

		//here when we define parent class as reference type and child class object type while making object then

		X r = new Y();
		r.m();
	}

}
