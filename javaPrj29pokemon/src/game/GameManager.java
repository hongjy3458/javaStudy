package game;

import java.util.Scanner;

import mob.Pokemon;

public class GameManager {
	
	public void gameStart() {
		
		System.out.println("1. 피카츄");
		System.out.println("2. 파이리");
		System.out.println("3. 꼬부기");
		
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		
		Pokemon user;
		Pokemon com;
		switch(userInput) {
		case "1" : 
			user = new Pokemon("피카츄" , 100, 30 , 10);
			com = new Pokemon("파이리" , 90, 33 , 8);
			break;
		case "2" :
			user = new Pokemon("파이리" , 90, 33 , 8);
			com = new Pokemon("꼬부기" , 110, 27 , 12);
			break;
		case "3" :
			user = new Pokemon("꼬부기" , 110, 27 , 12);
			com = new Pokemon("피카츄" , 100, 30 , 10);
			break;
		default :  
			System.out.println("잘못된 입력입니다. 프로그램 종료 ~~~");
			return;
		}
		
		boolean isDead = false;
		while(!isDead) {
			isDead = handleAttack(user , com);
			isDead = handleAttack(com , user);
		}
		
	}//gameStart
	
	private boolean handleAttack(Pokemon attacker , Pokemon deffender) {
		if(attacker.getHp() <= 0 || deffender.getHp() <= 0) {
			return true;
		}
		
		attacker.bodyAttack();
		int dmg = attacker.getAtk() - deffender.getDef();
		deffender.setHp( deffender.getHp() - dmg );
		System.out.println("공격이 적중했다. 데미지 : " + dmg);
		System.out.println( deffender.getName() + " 의 남은 체력 : " + deffender.getHp() );
		if(deffender.getHp() <= 0) {
			return true;
		}
		return false;
	}
	
	

}//class


















