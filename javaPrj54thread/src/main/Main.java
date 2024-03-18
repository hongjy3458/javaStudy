package main;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread(  
				() -> {
					String name = Thread.currentThread().getName();
					for(int i = 0 ; i < 10; ++i) {
						System.out.println("[" + name + "]" + i);
					}
				}
			).start();
		
		
		new Thread( () -> {
			String name = Thread.currentThread().getName();
			for(int i = 0 ; i < 10; ++i) {
				System.out.println("[" + name + "]" + i);
			}
		} )
		.start();
		
		
		
		new KhThread().start();
		
		
		Thread.currentThread().sleep(3000);
		
		System.out.println("메인쓰레드는 할일 끝 ~~~");
		
	}//main

}//class



















