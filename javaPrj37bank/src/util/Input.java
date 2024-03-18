package util;

import java.util.Scanner;

public class Input {
	
	private static final Scanner sc = new Scanner(System.in); 
	
	// 문자열 받기
	public static String scanString() {
		 String x = Input.sc.nextLine();
		 return x;
	}
	
	// 정수 받기
	public static int scanInt() {
		return Integer.parseInt(sc.nextLine());
	}
	

}//class






