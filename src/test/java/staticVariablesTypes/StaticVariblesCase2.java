package staticVariablesTypes;

// static variable can share itself with every object
// here is, share-ability and memory management is happening by using Static keyword
// static variable allocate memory only once during class loading, because of this property it save a lot of memory in heap memory and program runs fast


class Employees {
	
	int empId;
	String name;
	static String company = "hero"; // here static variable is sharing itself with every object

	
	Employees (int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	
	void ma2() {
		
		System.out.println(empId + " " + name + " " + company  );
	}
}


public class StaticVariblesCase2 {

	public static void main(String[] args) {
		
		Employees nn =  new Employees(101, "rama"); 		nn.ma2();
		Employees nn1 =  new Employees(102, "kama");		nn1.ma2();
		Employees nn2 =  new Employees(103, "yama");		nn2.ma2();
		Employees nn3 =  new Employees(104, "lama");		nn3.ma2();
		Employees nn4 =  new Employees(105, "chama");		nn4.ma2();
		
	}

}
