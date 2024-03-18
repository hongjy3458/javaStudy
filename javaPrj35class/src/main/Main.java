package main;

import test.Person;
import test.Pokemon;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 클래스 작성 연습 =====");
		
		Pokemon p = new Pokemon();
		p.setName("피카츄");
		p.setHp(100);
		p.setAtk(30);
		
		System.out.println( p );
		
		
		
	}

}
