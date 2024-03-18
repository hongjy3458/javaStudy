package main;

import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
//		정수 a,b 를 입력받고
//		a 부터 b 까지 모든 정수를 출력
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a < b) {
			for(int x = a ; x <= b ; x = x+1){
				System.out.println(x);
			}
		}else {
			for(int x = b ; x <= a ; x = x+1){
				System.out.println(x);
			}
		}
		
		
		
		
		
		

	}

}
