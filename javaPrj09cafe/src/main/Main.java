package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		메뉴 보여주기
//		메뉴 입력받기 (도구준비 + 도구사용)
//		수량 입력받기
//		메뉴, 수량, 총 가격 출력하기		
		
		System.out.println("===== 스타벅스 =====");
		
		// 메뉴 보여주기
		System.out.println("1. 아메리카노	(1500원)");
		System.out.println("2. 제육볶음	(40000원)");
		System.out.println("3. 계란말이	(25000원)");
		
		//입력도구 준비 (Scanner 에 빨간줄 생기면 import 하기)
		Scanner sc = new Scanner(System.in);

		//메뉴 입력 받기
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		//수량 입력 받기
		System.out.print("메뉴 수량 : ");
		int menuCnt = sc.nextInt();
		
		//메뉴 가격을 기록하기 위한 변수 미리 준비함
		int menuPrice = 0;
		
		//주문 정보 출력하기 (메뉴이름, 수량, 가격)
		System.out.println("-----주문 확인-----");
		if(menuNum == 1) {
			menuPrice = 1500;
			System.out.println("주문하신 메뉴는 아메리카노	입니다");
		}else if(menuNum == 2) {
			menuPrice = 40000;
			System.out.println("주문하신 메뉴는 제육볶음 	입니다");
		}else if(menuNum == 3) {
			menuPrice = 25000;
			System.out.println("주문하신 메뉴는 계란말이 	입니다");
		}
		
		System.out.println("메뉴 수량은 " + menuCnt + " 개 입니다.");
		
		
		int totalPrice = menuPrice * menuCnt;
		System.out.println("총 가격은 " + totalPrice + " 원 입니다.");
		
		
		
//		System.out.println("메뉴이름 : " + 변수);
//		System.out.println("수량 : " + 변수);
//		System.out.println("총 가격 : " + 변수);
		
	}

}

















