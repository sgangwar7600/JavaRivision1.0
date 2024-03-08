package oopsJavaRevision;

public class ByUsingMethod {

	
	String color;
	
	int age;
	
	public static void main(String[] args) {
		
		ByUsingMethod dog = new ByUsingMethod();
	
		dog.firstmethod("black   ", 12);
		
		dog.seconfmethod();
		
	}
	
	void firstmethod (String c, int a) {
		
		color = c;
		age = a ;
		
	}
	
	void seconfmethod() {
		
		System.out.println(color + age);
	}
	
}
