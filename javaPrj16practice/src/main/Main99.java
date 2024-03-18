package main;

import java.util.Scanner;

public class Main99 {

	public static void main(String[] args) {
		
		System.out.println("===== 가위바위보 =====");
		
		
		//유저 패 입력받기
		System.out.println("가위/바위/보 입력 : ");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		
		//컴퓨터 패 설정 (랜덤)
		int randNum = (int)(Math.random() * 3 + 1);
		
		String com = "?????";
		
		switch(randNum) {
		case 1 : 
			com = "가위";
			break;
		case 2 : 
			com = "바위"; 
			break;
		case 3 : 
			com = "보";		
			break;
		}
		
		System.out.println("컴퓨터 : " +com); 
		
		//승/패 판단하기
		if(user.equals("가위") && com.equals("보")||user.equals("바위") && com.equals("가위")||user.equals("보") && com.equals("바위")){
			System.out.println("유저 승리 !");
		}
		else if(com.equals("가위") && user.equals("보")||com.equals("바위") && user.equals("가위")||com.equals("보") && user.equals("바위")) {
			System.out.println("유저 패배 ...");
		}else {
			System.out.println("무승부");
		}
		
		

		
	}//main

}//class



























