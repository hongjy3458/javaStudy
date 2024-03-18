package main;

import java.util.Scanner;

public class Main01 {

	public static void main(String[] args) {
//		정수1개 입력받고 // 입력도구 준비 , 입력도구 사용
//		양수인지 음수인지 0인지 판단하여 출력하기
		
		Scanner sc = new Scanner(System.in); 
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("양수");
		}
		else if(x < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("제로");
		}
		
	}

}














