package main;

import bank.AccountInfo;
import bank.BankSystem;

public class Main {

	public static void main(String[] args) {
		
		BankSystem bs = new BankSystem();
		
		AccountInfo x = new AccountInfo("홍길동" , "111222333456" , "1234" , 0 , 1000000);
		
		
		while(true) {
			//메뉴 보여주고 숫자 리턴받기
			int num = bs.showMenu();
			
			//번호에 따라 동작하게 만들기
			switch(num) {
			case 0 : System.out.println("종료하기!"); return;
			case 1 : bs.selectBalance(x); break;
			case 2 : bs.plus(x); break;
			case 3 : bs.minus(x); break;
			default : System.out.println("잘못된 번호입니다. 다시 입력하세요."); 
			}
		}//while

	}//main

}//class
