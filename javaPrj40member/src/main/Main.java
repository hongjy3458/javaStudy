package main;

import java.util.Scanner;

import member.MemberController;

public class Main {
	
	public static final Scanner SC = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("===== 회원 관리 프로그램 =====");
		
		MemberController memberController = new MemberController();
		
		boolean isFinish = false;
		while(!isFinish) {
			isFinish = memberController.printMenu();
		}

	}//main

}//class






