package main;

import java.io.PrintWriter;

public class MsgBroadcaster extends Thread implements Runnable {
	
	@Override
	public void run() {
		
		while(true) {
			try {Thread.sleep(1);} catch (InterruptedException e) {System.out.println("쓰레드 자는데 방해함 ,,");}
			String msg = ServerMain.MSG_QUEUE.poll();
			if(msg == null) {
				continue;
			}
			for(PrintWriter pw : ServerMain.PW_LIST) {
				pw.println(msg);
				pw.flush();
			}
		}//while
		
	}//run

}//class
