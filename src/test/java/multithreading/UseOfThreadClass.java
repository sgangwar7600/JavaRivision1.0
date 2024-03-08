package multithreading;

class OtherClass1 extends Thread {
	
	public static synchronized   void run1() {

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
	}}
		
	public void run() {
		run1();
	}
}


public  class UseOfThreadClass {

	public static void main(String[] args) {

		 OtherClass1 r1 = new OtherClass1();
		 r1.start();
		 OtherClass1 r2 = new OtherClass1(); 
		 r2.start();
		 OtherClass1 r3 = new OtherClass1(); 
		 r3.start();
		 OtherClass1 r4 = new OtherClass1(); 
		 r4.start();
		 OtherClass1 r5 = new OtherClass1(); 
		 r5.start();
		 

	}
}
