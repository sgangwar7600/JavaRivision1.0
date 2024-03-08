package interfacee;


interface I1 {
	
	public static final int a = 10;
	
		public abstract  void run() ; // only declaration part
}


public class InterFaceCase1 implements I1 {

	public static void main(String[] args) {

		InterFaceCase1 r = new InterFaceCase1();
		r.run();
		
	}
	
	public void run() {
		
		System.out.println("run class must be public");
		
		System.out.println(a);
	}
	
}
