package main;

import java.util.Scanner;

public class Test03 {
	
	public void method01() {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x > 0) {
			System.out.println("양수");
		}else if(x < 0) {
			System.out.println("음수");
		}else {
			System.out.println("제로");
		}
	}//method01
	
	public void method02() {
		// 숫자 입력받고, 해당 월은 몇일 까지 있는지 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 :");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("31일 까지 있습니다."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("30일 까지 있습니다."); break;
		case 2: System.out.println("28일 까지 있습니다."); break;
		default : System.out.println("1~12 중에서 입력하세요");
		}
	}//method02
	
	
	

}//class Test03




