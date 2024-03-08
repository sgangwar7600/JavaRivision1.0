package oopsJavaRevision;

public class InitializingObjectByUsingMethod1 {

	String name;
	String color;
	int age;
	String petName;
	
	public static void main(String [] args) {
		
		InitializingObjectByUsingMethod1
		 
		qualities = new InitializingObjectByUsingMethod1();
		
		qualities.fmethod("Tesla", "red", 15, "SwamiVivekaNanada");
		
		qualities.Smethod();
		
	}
	
	void fmethod(String a , String b, int c, String d) {
		name = a;
		color = b;
		age = c;
		petName = d;
		
	}
	
	void Smethod() {
	
		System.out.println( " " + name + " " + color + " " + age + " "  + petName  );
	}
	
}
