package interfacee;


interface II1 {
	
	public static final int x = 11 ;
	
	public abstract void nikola() ;
	
}

interface II2 extends II1 {
	
	public static final String y = "Ramanujan" ;
	
	public abstract void Tesla() ;
}

interface II3 extends II2 {
	
	public static final char  z = 'Q' ;
	
	public abstract void again();
}


public class InterfaceCase2 implements II1, II2,II3 {
	
	public void nikola() { 	System.out.println("interface I1 method");
							System.out.println(x);}
	
	public void Tesla() { 	System.out.println("interface I2 method");
	System.out.println(y);   }
	
	public void again() { 	System.out.println("interface I3 method");
	System.out.println(z);   }

	
	public static void main(String[] args) {

		InterfaceCase2 rr = new InterfaceCase2();
		rr.nikola();
		rr.Tesla();
		rr.again();
	}

}
