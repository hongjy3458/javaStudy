package main;

import java.io.BufferedReader;
import java.io.IOException;

public class MsgReader extends Thread implements Runnable {
	
	private BufferedReader br;
	
	public MsgReader(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		
		while(true) {
			try {
				String rcvMsg = br.readLine();
				System.out.println("[상대방] " + rcvMsg);
			} catch (IOException e) {
				System.out.println("예외 발생 ~~~");
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("잠든 쓰레드 방해함...");
			}
			
		}
		
	}//run

}//class












