package staticMethodsTypes;


class BB {
	
	void m11 () {
		
		System.out.println("m11");
	}
	
	static	void m22() {
		
		System.out.println("m22");
	}
}

class CC {
	
	static	void m33() {
		
				System.out.println("m33");
			}
		}

public class StaticMethodCase3 {

	public static void main(String[] args) {
			BB rr = new BB() ;
			
			rr.m11();
			
			BB.m22();
			
			CC.m33();

	}

}
