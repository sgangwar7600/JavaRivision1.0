package polymorphismTypes;

public class MethodhOverloading {

	// no of argument
	void show(int a) { System.out.println("show method 1");}
	// no of argument
	void show() { System.out.println("show method 2") ; }
	//sequence of arguments
	void show(int a, String b) { System.out.println("show method 3");}
	//types of arguments
	void show(String a, int b) { System.out.println("show method 4");}


	
	public static void main(String[] args) {
		
		MethodhOverloading n = new MethodhOverloading();
		
		n.show();                         	// no of argument
		n.show(10);							// no of argument
		n.show(10, "Bhabha");				//sequence of arguments
		n.show("Vikram Sarabhai", 15);		//types of arguments
	}
}
