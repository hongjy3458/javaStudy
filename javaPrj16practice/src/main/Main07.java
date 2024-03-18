package main;

import java.util.Scanner;

public class Main07 {

	public static void main(String[] args) {
		
//		정수 n 을 입력받고, * 을 n개 만큼 출력하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 0; x < n; x = x+1) {
			System.out.print("*");
		}
		

		
	}

}
