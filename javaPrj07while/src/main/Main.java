package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=====while=====");
		
		// Hello World 출력 5번 반복
//		int cnt = 0;
//		while(cnt < 5) {
//			System.out.println("Hello World ~ !");
//			cnt = cnt+1;
//		}
		
		// 출력문 실행 // 출력내용 : 0 부터 1씩 증가 하면서 출력
//		int x = 0;
//		while(x < 5) {
//			System.out.println(x);
//			x = x+1;
//		}
		
		// 1 ~ 100 출력
//		int x = 1;
//		while(x <= 100) {
//			System.out.println(x);
//			x = x+1;
//		}
		
		// 100 ~ 1 출력
//		int x = 100;
//		while(x >= 1) {
//			System.out.println(x);
//			x = x-1;
//		}
		
		// -10 ~ 10 출력
//		int x = -10;
//		while(x <= 10) {
//			System.out.println(x);
//			x = x+1;
//		}
		
		// 1 ~ 100 사이의 숫자 중 홀수만 출력
		int x = 1;
		while(x <= 100) {
			if(x % 2 == 1){
				System.out.println(x);
			}
			x = x+1;
		}
		
		
		
		
		

	}//main

}//class




