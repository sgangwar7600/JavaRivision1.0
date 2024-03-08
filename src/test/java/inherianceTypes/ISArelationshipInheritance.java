package inherianceTypes;


class OP {
	void mainn() { System.out.println("parent class");}
}



public class ISArelationshipInheritance extends OP {

	public static void main(String[] args) {

		OP rr = new OP();
		
		rr.mainn();
	}

}
