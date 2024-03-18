package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerConnector extends Thread implements Runnable {
	
	private ServerSocket ss;

	public ServerConnector(ServerSocket ss) {
		this.ss = ss;
	}

	@Override
	public void run() {
		
		while(true) {
			
			try {
				System.out.println("연결 대기중 ...");
				Socket socket = ss.accept();		//연결 대기
				System.out.println( socket.getInetAddress() + " 연결 됨 !!!");
				
				//소켓으로부터 통로 얻어냄 - 수신
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				//소켓으로부터 통로 얻어냄 - 발신
				OutputStream os = socket.getOutputStream();
				PrintWriter pw = new PrintWriter(os);
				
				//준비된 통로 처리 - 수신
				new ServerMsgReader(br , socket.getInetAddress().toString()).start();
				
				//준비된 통로 처리 - 발신
				ServerMain.PW_LIST.add(pw);
				
			} catch (IOException e) {
				System.out.println("연결 대기중 에러발생 ...");
			}		
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				System.out.println("자는데 방해한듯 ,,");
			}
			
		}//while
		
	}//run
	
}//class
