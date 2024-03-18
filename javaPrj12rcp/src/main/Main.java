package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("===== 가위바위보 =====");
		
		// 컴퓨터 패 준비
		// 유저 패 입력받기
		// 판단하고 출력
		
		int win = 0;
		int lose = 0;
		int draw = 0;

		Scanner sc = new Scanner(System.in);
		while(true) {
			int com = (int)(Math.random() * 3 + 1);
			
			System.out.println("1(가위), 2(바위), 3(보자기) 중 하나를 입력하세요 ");
			int user = sc.nextInt();
			
			if(user == 0) {
				System.out.println("0을 입력하셨습니다. 프로그램 종료.");
				break;
			}
			
			//유저 입력값 검사(1,2,3 중 하나인지 ?)
			if(user < 1 || 3 < user) {
				System.out.println("잘못된 입력입니다. 1,2,3 중 입력하세요");
				continue; //반복문 처음으로 돌아가세요
			}
			
			// 컴퓨터 패 출력
			if(com == 1) {
				System.out.println("컴퓨터 : 가위");
			}
			else if(com == 2) {
				System.out.println("컴퓨터 : 바위");
			}
			else if(com == 3) {
				System.out.println("컴퓨터 : 보자기");
			}
			
			
			if(user == com) {
				System.out.println("무승부");
				draw = draw+1;
			}
			else if(user == 1 && com == 2 || user == 2 && com == 3 || user == 3 && com == 1) {
				System.out.println("패배");
				lose = lose + 1;
			}
			else if(user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
				System.out.println("승리");
				win = win+1;
			}
		}
		
		System.out.println("-----스코어-----");
		System.out.println("승리 횟수 : " + win);
		System.out.println("패배 횟수 : " + lose);
		System.out.println("무승부 횟수 : " + draw);
		
	}//main

}//class





























