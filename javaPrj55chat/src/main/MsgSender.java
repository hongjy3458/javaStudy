package main;

import java.io.PrintWriter;
import java.util.Scanner;

public class MsgSender extends Thread implements Runnable {
	
	private Scanner sc;
	private PrintWriter pw;
	
	public MsgSender(Scanner sc, PrintWriter pw) {
		this.sc = sc;
		this.pw = pw;
	}

	@Override
	public void run() {
		while(true) {
			//유저한테 입력받기
			System.out.print("[YOU] : ");
			String inputMsg = sc.nextLine();
			
			//발신
			pw.println(inputMsg);
			pw.flush();
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("잠든 쓰레드 방해한듯 ,,,");
			}
		}
	}//run

}//class
