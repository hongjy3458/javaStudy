package main;

import java.io.BufferedReader;
import java.io.IOException;

public class ServerMsgReader extends Thread implements Runnable {
	
	private BufferedReader br;
	private String ip;
	
	public ServerMsgReader(BufferedReader br, String ip) {
		this.br = br;
		this.ip = ip;
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				String msg = br.readLine();
				System.out.println(ip +" : " + msg);
				ServerMain.MSG_QUEUE.add(msg);
				
			} catch (IOException e) {
				System.out.println("메세지 읽다가 에러발생...");
				break;	//swy
			}
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("쓰레드 자는데 방해한듯,,");
			}
			
		}//while
		
	}//run

}//class








