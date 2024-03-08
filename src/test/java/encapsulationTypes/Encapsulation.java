package encapsulationTypes;

// declare all the variables private
// provide public "setter and getter" methods to modify and view the variables values
// when we put private modifier of any variable then it become data hiding ex: "private int emp_id"
// data hiding is a sub-part of encapsulation
// setter method : set/modify the value
// getter method : view the value
// getter and setter , both methods will be public

class Employee {
	
	private int emp_id ; 
	
	public void setEmp_id(int emp_Id1) {
		
		this.emp_id = emp_Id1;
	}
	
	public int getEmp_id() {
		
		return emp_id; }
	
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Employee n = new Employee();
		n.setEmp_id(101);
		System.out.println(n.getEmp_id());

}}
