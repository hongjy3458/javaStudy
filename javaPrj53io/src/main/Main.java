package main;

import member.controller.MemberController;

public class Main {

	public static void main(String[] args) throws Exception {
		
		System.out.println("===== IO =====");
		
		MemberController mc = new MemberController();
		mc.printMenu();
		
//		//파일 객체 준비
//		String filePath = "D:\\dev\\abc.txt";
//		File f = new File(filePath);
//		
//		//파일에 2byte씩 내보내는 통로 준비 (메인스트림+보조스트림) 
//		FileWriter fw = new FileWriter(f);					//메인
//		BufferedWriter bw = new BufferedWriter(fw);			//보조
//
//		//파일에서 2byte씩 읽어들이는 통로 준비 (메인스트림+보조스트림)
//		FileReader fr = new FileReader(f);					//메인
//		BufferedReader br = new BufferedReader(fr);			//보조
		
	}//main

}//class


		
		
		
		
		
		
		
		
		
		
		