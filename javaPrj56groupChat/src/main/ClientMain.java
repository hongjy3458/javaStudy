package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	
	public static String nick;
	
	public static void main(String[] args) {
		
		System.out.println("=====CLIENT=====");
		
		try {
			// 소켓 연결
			Socket socket = new Socket("192.168.40.44" , 12345);
			
			// 통로 준비 - 수신
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			// 통로 준비 - 발신
			OutputStream os = socket.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			// 스캐너 준비
			Scanner sc = new Scanner(System.in);
			
			// 닉네임 입력받기
			System.out.print("채팅방에서 사용할 닉네임 : ");
			nick = sc.nextLine();
			
			// 쓰레드 일 시키기 (Reader , Sender)
			new ClientMsgReader(br).start();
			new ClientMsgSender(sc, pw).start();
			
		} catch (IOException e) {
			System.out.println("소켓 연결 실패 ... 시작도 못함 ...");
			System.out.println("===== CLIENT END =====");
		}
		
	}//main
	

}//class





















