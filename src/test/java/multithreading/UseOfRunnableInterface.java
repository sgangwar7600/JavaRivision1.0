package multithreading;

class A implements Runnable {
	
			public   void run() {
				
				for(int i=1; i<=100; i++) {
					System.out.println( "class A " + i);
				}}
			}

class B implements Runnable {
	
	public void run() {

		for(int j=1; j<=100; j++) {
			System.out.println( "class B " + j);
		}}
	
	}
public class UseOfRunnableInterface {

	public static void main(String[] args) {

		A r1 = new A();
		B r2 = new B();
		
		Thread r3 = new Thread(r1);  // 1 lock
		r3.start();
		
		Thread r4 = new Thread(r2);  // 1 lock
		r4.start();
		
	}

}
