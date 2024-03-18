package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class ClientMsgSender extends Thread implements Runnable {
	
	private Scanner sc;
	private PrintWriter pw;
	
	public ClientMsgSender(Scanner sc, PrintWriter pw) {
		this.sc = sc;
		this.pw = pw;
	}

	@Override
	public void run() {
		while(true) {
			//발신
			String inputStr = sc.nextLine();
			pw.println("[" + ClientMain.nick + "] " + inputStr);
			pw.flush();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("쓰레드 자는데 누가 방해함 ,,,");
			}
		}//while
	}//run

}//class





