package main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServerMain {
	
	public static final List<PrintWriter> PW_LIST = new ArrayList<PrintWriter>();
	public static final Queue<String> MSG_QUEUE = new LinkedList<String>();
	
	public static void main(String[] args) {
		
		System.out.println("=====SERVER=====");
		
		try {
			ServerSocket ss = new ServerSocket(12345);	//서버 소켓 생성
			System.out.println("서버 소켓 생성 !");
			
			//연결 담당 쓰레드
			new ServerConnector(ss).start();
			
			//브로드캐스트 담당 쓰레드
			new MsgBroadcaster().start();
			
		} catch (IOException e) {
			System.out.println("서버소켓 생성 실패 ...");
		}		
		
	}//main

}//class




