package polymorphismTypes;

public class MainMethodOverloading {

	
	// Yes , we can overload main method
	//same name
	//same class
	//different arguments
	
	public static void main(String[] args) {

		System.out.println("1");
		
		MainMethodOverloading nn = new MainMethodOverloading();
		nn.main(20);
	}
	
	 void main(int a) {
		
		System.out.println("2");

	}

}
