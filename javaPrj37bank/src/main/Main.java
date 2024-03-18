package main;

import bank.BankSystem;

public class Main {

	public static void main(String[] args) {
		
		BankSystem bs = new BankSystem();
		
		boolean isFinish = false;
		while(isFinish == false){
			isFinish = bs.showMenu();
		}
		
	}//main

}//class
