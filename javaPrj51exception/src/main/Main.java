package main;

import kh.exception.JoinException;
import practice.MemberController;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("=====exception=====");
		
		MemberController mc = new MemberController();
		
		try {
			mc.join();
		}catch(JoinException e) {
			System.out.println("회원가입 실패 ,,,,...");
			System.out.println( e.getMessage() );
		}
		
//		ExceptionTest et = new ExceptionTest();
//		et.method04();
		
	}//main

}//class




















