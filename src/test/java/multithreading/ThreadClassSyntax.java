package multithreading;

class otherclass extends Thread {   							// inherits the "Thread" class
	
public void run() {												// override the run() class
		
		System.out.println("syntax of thread");
	}
}


public class ThreadClassSyntax  {


	public static void main(String[] args) {
		
		otherclass r = new otherclass();						// create an instance of other class
		r.start();												// start the thread by calling thread method from thread class
																// start() method invoke the override run() method
		
		
	}

}
