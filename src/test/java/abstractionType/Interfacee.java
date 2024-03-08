package abstractionType;

// abstract method are allow in interface like abstraction
// we can not create object of abstract class as well interface
// all the variables within interface are public static final
// also we can mention concrete method and static method with default keyword
// also you have to use public keyword before making any method in class while implementing the interface


interface I1 {
	
	void show();  //abstract method
}


public class Interfacee implements I1 {

	public void show() {
		System.out.println("1");
	}
	
	public static void main(String[] args) {
		
		Interfacee n = new Interfacee();
		n.show();
	}
}
