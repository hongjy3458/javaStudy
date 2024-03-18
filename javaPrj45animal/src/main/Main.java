package main;

import java.util.Scanner;

import animal.AnimalController;

public class Main {
	
	public static final Scanner SC = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("===== 동물사전 =====");
		
		AnimalController ac = new AnimalController();
		
		boolean isFinish = false;
		while(!isFinish) {
			isFinish = ac.printMenu();
		}
		
	}//main

}//class
