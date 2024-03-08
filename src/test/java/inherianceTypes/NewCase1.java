package inherianceTypes;

class AA {
	
	void kk() {System.out.println("AA class with kk method");}
}

class BBBB extends AA	{
	
	
}


public class NewCase1 {

	public static void main(String[] args) {


		BBBB r = new  BBBB();
		
			r.kk();
	}

}
