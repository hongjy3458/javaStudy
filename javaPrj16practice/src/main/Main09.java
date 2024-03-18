package main;

import java.util.Scanner;

public class Main09 {

	public static void main(String[] args) {
//		자연수 n 을 입력받고,
//		1부터 n 까지 중 홀수의 합
//		1부터 n 까지 중 짝수의 합
//		각각 출력하기
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
		
		for(int x=1 ; x<n+1 ; x++) {
			if(x % 2 == 1) {
				oddSum = oddSum + x;
			}else {
				evenSum = evenSum + x;
			}
		}
		
		System.out.println("홀수 합계 : " + oddSum);
		System.out.println("짝수 합계 : " + evenSum);
		
		
	}//main

}//class






















