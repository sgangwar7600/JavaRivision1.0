package multithreading;

class OtherClassAaaa extends Thread {
	
	public synchronized   void run() {

		for (int i = 1; i <= 100; i++) {

			System.out.println(i);
	}}
	
}

public  class SynchronizedThreadClass {

	public static void main(String[] args) {

		 OtherClassAaaa r1 = new OtherClassAaaa();				// 1 thread = 1 lock
		 r1.start();
		 OtherClassAaaa r2 = new OtherClassAaaa(); 				// 1 thread = 1 lock
		 r2.start();
		 OtherClassAaaa r3 = new OtherClassAaaa(); 				// 1 thread = 1 lock
		 r3.start();
		 OtherClassAaaa r4 = new OtherClassAaaa(); 				// 1 thread = 1 lock
		 r4.start();
		 OtherClassAaaa r5 = new OtherClassAaaa(); 				// 1 thread = 1 lock
		 r5.start();
		 

	}
}
