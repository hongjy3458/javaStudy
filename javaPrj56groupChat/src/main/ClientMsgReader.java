package main;

import java.io.BufferedReader;
import java.io.IOException;

public class ClientMsgReader extends Thread implements Runnable {
	
	private BufferedReader br;
	
	public ClientMsgReader(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		
		while(true) {
			//수신
			try {
				String rcvMsg = br.readLine();
				System.out.println(rcvMsg);
			} catch (IOException e) {
				System.out.println("메세지 읽기 실패 ...");
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("쓰레드 자는데 누가 방해함 ...");
			}
			
		}
		
	}//run

}//class







		