package multithreading;


class AnotherClass implements Runnable {
	
	public void run() {
	
	}
	
}

public class RuunableInterfaceSyntax  {

				public static void main(String[] args) {

					AnotherClass rr = new AnotherClass();
					
					Thread rr1 = new Thread(rr);
					
					rr1.start();
					
	}

}
