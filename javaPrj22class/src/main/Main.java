package main;

public class Main {

	public static void main(String[] args) {
		
		//피카츄 준비
		Pokemon p1 = new Pokemon();
		p1.name = "피카츄";
		p1.hp = 100;
		p1.atk = 30;
		
		//파이리 준비
		Pokemon p2 = new Pokemon();
		p2.name = "파이리";
		p2.hp = 90;
		p2.atk = 33;
		
		//배틀
		while(p1.hp > 0 && p2.hp > 0) {
			
			p1.bodyAttack();
			p2.hp -= p1.atk;
			System.out.println(p1.name + " 가 " + p2.name + " 를 공격했다.");
			System.out.println(p2.name + "의 남은 체력 : " + p2.hp);
			System.out.println();
			
			//p2 의 공격
			if(p2.hp > 0) {
				p2.bodyAttack();
				p1.hp -= p2.atk;
				System.out.println(p2.name + " 가 " + p1.name + " 를 공격했다.");
				System.out.println(p1.name + "의 남은 체력 : " + p1.hp);
				System.out.println();
			}//if
			
		}//while
		
		
		
		
	}//main

}//class























