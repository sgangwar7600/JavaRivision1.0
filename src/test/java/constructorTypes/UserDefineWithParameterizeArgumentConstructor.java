package constructorTypes;

public class UserDefineWithParameterizeArgumentConstructor {

	int a;
	String firstname;
	String lastnmae;
	
	UserDefineWithParameterizeArgumentConstructor(int aa, String firstnamee, String lastnmaee) {
		
		this.a = aa;
		this.firstname= firstnamee;
		this.lastnmae=lastnmaee;
	};
	
	public static void main(String[] args) {
		
		UserDefineWithParameterizeArgumentConstructor q1 = new UserDefineWithParameterizeArgumentConstructor(10, "Nikola", "Tesla" );
		UserDefineWithParameterizeArgumentConstructor q2 = new UserDefineWithParameterizeArgumentConstructor(20 , "Homi Jehangir Bhabha", "father of the Indian nuclear program");
		UserDefineWithParameterizeArgumentConstructor q3 = new UserDefineWithParameterizeArgumentConstructor(30, "Vikram Sarabhai", " Father of the Indian space program");

		
		System.out.println(q1.a + " " + q1.firstname + "__" + q1.lastnmae);
		System.out.println(q2.a + " "  + q2.firstname + "__"  + q2.lastnmae);
		System.out.println(q3.a + " "  + q3.firstname + "__"  + q3.lastnmae);


		
	};
	
	
	
	
	
}
