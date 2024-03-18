package main;

import java.util.Scanner;

import board.BoardController;

public class Main {
	
	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {

		BoardController bc = new BoardController();
		
		boolean isFinish = false;
		while(!isFinish) {
			isFinish = bc.printMenu();
		}
		
	}//main

}//class






