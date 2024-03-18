package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 스타벅스 =====");
		
		/*
		 * 1. 메뉴판 보여주기
		 * 2. 닉네임 입력받기
		 * 3. 메뉴 입력받기
		 * 4. 요청사항 입력받기
		 * 5. 주문 내역 확인(ㅇㅇㅇ님, 메뉴이름,요청사항 출력)
		 */
		
		//입력도구 준비
		Scanner sc = new Scanner(System.in);

		//메뉴판
		System.out.println("1. 아메리카노 	(1000원)");
		System.out.println("2. 꿀물 		(2000원)");
		System.out.println("3. 미숫가루 	(3000원)");
		
		//닉네임
		System.out.print("닉네임 입력 : ");
		String nick = sc.nextLine();
		
		//메뉴
		System.out.print("메뉴 번호 입력 : ");
		String menuNumStr = sc.nextLine();
		int menuNum = Integer.parseInt(menuNumStr);
		
		//요청사항
		System.out.print("요청사항 입력 : ");
		String msg = sc.nextLine();
		
		//메뉴이름
		String menuName;
		switch(menuNum) {
		case 1 : menuName = "아메리카노"; 	break;
		case 2 : menuName = "꿀물"; 		break;
		case 3 : menuName = "미숫가루"; 	break;
		default : menuName ="잘못된 메뉴 번호";
		}
		
		System.out.println("----- 주문 내역 확인 -----");
		System.out.println("닉네임 : " + nick);
		System.out.println("메뉴 : " + menuName);
		System.out.println("요청사항 : " + msg);
		
		
	}

}
























