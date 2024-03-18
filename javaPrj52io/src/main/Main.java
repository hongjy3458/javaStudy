package main;

import member.MemberController;

public class Main {
	
	public static void main(String[] args) throws Exception {
		System.out.println("===== io =====");
		
		MemberController mc = new MemberController();
		mc.join();
		
	}//main

}//class
