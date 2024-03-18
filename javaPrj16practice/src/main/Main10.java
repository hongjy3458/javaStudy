package main;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {

//		자연수를 입력받고, 
//		소수이면 prime 이라고 출력
//		소수가 아니면 not prime 이라고 출력
		
		boolean isPrime = true;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("not prime");
			isPrime = false;
		}
		
		for(int i = 2; i < num; i++) {
			if(num%i == 0) {
				System.out.println("not prime");
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("prime");
		}
		

		
		
	}

}
