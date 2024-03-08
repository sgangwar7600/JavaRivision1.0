package polymorphismTypes;

		//same name
		//different class
		//same parameter or arguments
		// IS-A Relationship
//final, static, private methods can not be override
//synchronized and strictfp method can be override
// always a child class will be print 

class A{
		
		void show() { System.out.println("1");}
}
public class MethodOveridingCase1 extends A{
	
	void show() { System.out.println("2");}
		
	
	public static void main(String[] args) {
					
			A nn = new MethodOveridingCase1();
			nn.show();
			

}		}