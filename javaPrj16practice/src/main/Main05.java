package main;

import java.util.Scanner;

public class Main05 {

	public static void main(String[] args) {
		
//		100 이하의 자연수 n을 입력받고,
//		1부터 n까지의 총 합을 출력
		
		int result = 0;

//		int x = 1;
//		while(x <= 10) {
//			result = result + x;
//			x = x+1;
//		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 1 ; x <= n ; x = x+1) {
			result = result + x;
		}
		
		
		System.out.println(result);

	}

}
