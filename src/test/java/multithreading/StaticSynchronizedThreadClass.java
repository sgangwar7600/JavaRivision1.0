package multithreading;

class OtherClassAA extends Thread {
	
	public static synchronized   void run1() {

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
	}}
		
	public void run() {
		run1();
	}
}


public  class StaticSynchronizedThreadClass {

	public static void main(String[] args) {

		OtherClassAA r1 = new OtherClassAA();				// 1 thread = 1 lock
		 r1.start();
		 OtherClassAA r2 = new OtherClassAA(); 				// 1 thread = 1 lock
		 r2.start();
		 OtherClassAA r3 = new OtherClassAA(); 				// 1 thread = 1 lock
		 r3.start();
		 OtherClassAA r4 = new OtherClassAA(); 				// 1 thread = 1 lock
		 r4.start();
		 OtherClassAA r5 = new OtherClassAA(); 				// 1 thread = 1 lock
		 r5.start();
		 

	}
}
