package member.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MemberController {
	
	private final String filePath;
	private final File f;
	private final Scanner sc;
	
	public MemberController() {
		filePath = "D:\\dev\\abc.txt";
		f = new File(filePath);
		sc = new Scanner(System.in);
	}
	
	//메뉴 보여주기
	public void printMenu() throws Exception {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		
		String num = sc.nextLine();
		switch(num) {
		case "1" : join(); break;
		case "2" : login(); break;
		}
	}//method
	
	// 회원가입
	public void join() throws Exception {
		//입력
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		//저장 (메모장에 저장)
		FileWriter fw = new FileWriter(f , true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(id);
		bw.write("#");
		bw.write(pwd);
		bw.write("#");
		bw.write(nick);
		bw.write("\n");
		bw.close();
		
		//완료 알림
		System.out.println("회원가입 완료 !");
	}
	
	// 로그인
	public void login() {
		//입력
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		
		
		//메모장에서 데이터 읽기
		FileReader fr;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			while(true) {
				String str = br.readLine();
				if(str == null) {
					break;
				}
				
				//읽은 데이터 이용하여 로그인 성공여부 판단
				String[] strArr = str.split("#");
				String memoId = strArr[0];
				String memoPwd = strArr[1];
				String memoNick = strArr[2];
				boolean isOk = id.equals(memoId) && pwd.equals(memoPwd);
				if(isOk) {
					System.out.println("로그인 성공 !");
					System.out.println(memoNick + " 님 환영합니다 ~ ^^");
					return;
				}
			}//while
			System.out.println("로그인 실패 ...");
		}catch(Exception e) {
			System.out.println("로그인 하다가 예외 발생함 ...");
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			}catch(Exception e) {
				System.out.println("close 하다가 예외 발생 ~");
			}
		}
		
	}//method

}//class


				
				
				

