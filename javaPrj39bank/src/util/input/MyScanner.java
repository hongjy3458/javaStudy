package util.input;

import java.util.Scanner;

public class MyScanner {
	
	private static final Scanner sc = new Scanner(System.in);
	
	// 문자열
	public static String scanString() {
		return sc.nextLine();
	}
	
	// 정수
	public static int scanInt() {
		return Integer.parseInt(sc.nextLine());
	}
	

}
