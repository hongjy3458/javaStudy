package main;

import java.util.Scanner;

public class UpDown {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 100) + 1;
		
		while(true) {
			System.out.println("1 ~ 100 사이의 숫자를 입력하세요");
			int num = sc.nextInt();
			
			if(num < answer) {
				System.out.println("UP");
			}
			
			if(num > answer) {
				System.out.println("DOWN");
			}
			
			if(num == answer) {
				System.out.println("정답");
				break;
			}
			
		}
		
		
	}

}
