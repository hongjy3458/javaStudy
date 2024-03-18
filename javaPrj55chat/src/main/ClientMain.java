package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("===== client main =====");
		
		Socket s = new Socket("127.0.0.1" , 12345);	//127.0.0.1 (localhost) ip의 12345 포트에 연결
		System.out.println("connect to server !!!");
		
		// 발신 통로 준비
		OutputStream os = s.getOutputStream();
		PrintWriter pw = new PrintWriter(os);
		
		// 수신 통로 준비
		InputStream is = s.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		// 스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		new MsgSender(sc, pw).start();
		new MsgReader(br).start();
		
		
	}//main

}//class


		
		
		
		
		
		
		
		
