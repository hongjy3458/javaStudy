package main;

import member.Member;

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("=====객체 배열=====");
		
		Member[] memberArray = new Member[3];
		memberArray[0] = new Member("user01" , "1111" , "nick01");
		memberArray[1] = new Member("user02" , "2222" , "nick02");
		memberArray[2] = new Member("user03" , "3333" , "nick03");
		
		System.out.println( memberArray[0].getId() );
		System.out.println( memberArray[1].getId() );
		System.out.println( memberArray[2].getId() );
		
	}//main

}//class





















