package main;

public class KhRunner implements Runnable {

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();

		for(int i = 0 ; i < 10; ++i) {
			System.out.println("[" + name + "] " + i);
		}
		
	}//method

}//class
