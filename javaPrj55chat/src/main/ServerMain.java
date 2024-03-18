package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws Exception {
		
		System.out.println("===== server main =====");
		
		ServerSocket ss = new ServerSocket(12345);
		
		System.out.println("connection waiting ...");
		Socket socket = ss.accept();	//클라이언트 소켓이 연결되기전까지 쓰레드는 여기에 멈춰있음
		System.out.println("connect !!!");
		
		//수신 통로 생성
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		//발신 통로 생성
		OutputStream os = socket.getOutputStream();
		PrintWriter pw = new PrintWriter(os);

		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		//reader/sender 쓰레드 만들고, 일 시키기
		new MsgReader(br).start();
		new MsgSender(sc , pw).start();
		
	}//main

}//class






















