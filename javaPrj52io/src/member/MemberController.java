package member;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MemberController {
	
	public void join() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		//입력받기
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd = sc.nextLine();
		System.out.print("닉네임 : ");
		String nick = sc.nextLine();
		
		//검증하기
		
		//데이터 뭉치기
		
		//저장하기
		String filePath = "D:\\dev\\abc.txt";
		FileOutputStream fos = new FileOutputStream(filePath);
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write(id);
		osw.write("#");
		osw.write(pwd);
		osw.write("#");
		osw.write(nick);
		
		osw.flush();
		
		System.out.println("성공 ㅋㅋㅋ ㄴㅇㅅ");
		
	}//method

}//class




		



