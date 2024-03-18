package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// 업다운 게임
		
//		 1. 정답숫자 준비 (랜덤값 1 ~ 100)
//		 2. 유저한테 숫자 입력받기
//		 3. 업다운 판단하기
//		 - 업    => 2번으로 돌아가기
//		 - 다운 => 2번으로 돌아가기
//		 - 정답 => 게임종료
		
		int cnt = 0;
		
		// 정답 준비 
		int answer = (int)(Math.random() * 100 + 1);
		
		// 입력 도구 준비
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			// 입력받은 값을 변수에 저장
			int userInput = sc.nextInt();
			cnt = cnt+1;
			
			// 판단하기
			if(answer == userInput) {
				System.out.println("정답입니다.");
				System.out.println("(시도횟수 : " + cnt + ")");
				break;
			}
			
			if(answer > userInput) {
				System.out.println("UP");
			}
			
			if(answer < userInput) {
				System.out.println("DOWN");
			}
		}
		
		
		
	}//main

}//class









