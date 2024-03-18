package main;

import subway.SubwaySystyem;
import util.KhScanner;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("===== 지하철 =====");
		
		SubwaySystyem ss = new SubwaySystyem();
		
		boolean isFinish = false;
		while(!isFinish) {
			isFinish = ss.showMenu();
		}

	}//main

}//class
