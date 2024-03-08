package polymorphismTypes;

//Automatic Promotion:- One type is promoted to another
//Implicitly if no matching data type is found
 

public class AutomaticPromotinInMethodOverloading {

	void show(int a) {System.out.println("anything");}
	
	void show(String b) {System.out.println("vikram sarabhai");}
	
	
	public static void main(String[] args) {
		AutomaticPromotinInMethodOverloading nnn = new 
				AutomaticPromotinInMethodOverloading();
		
		nnn.show('k');

	}

}
