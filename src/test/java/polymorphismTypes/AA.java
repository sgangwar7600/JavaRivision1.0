package polymorphismTypes;

		//same name
		//different class
		//same arguments
		// IS-A Relationship
// final, static, private methods can not be override


class BB {
	
	void show(int x) { System.out.println("1");}
}

public class AA extends BB {
	
	public static void main(String[] args) {
	
		AA n = new AA();
		n.show(6);
		
		BB nn = new BB();
		nn.show(5);
		
	}
	
	void show(int y) { System.out.println("2");}
	
}
