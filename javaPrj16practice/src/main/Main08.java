package main;

import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {

//		정수 n 을 입력받고, * 을 n x n개 만큼 정사각형 모양으로 출력하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 0; x < n; x++) {
			for(int y = 0; y < n; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}








