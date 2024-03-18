package main;

import java.util.Scanner;

public class Main02 {

	public static void main(String[] args) {
		
//		정수1개 입력받고 (입력도구 준비 , 도구 사용)
//		홀수/짝수 판단하여 출력하기
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		
		if(x % 2 == 1 || x % 2 == -1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		

	}

}








