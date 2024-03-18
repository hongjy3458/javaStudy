package main;

import practice.Member;

public class Main {

	public static void main(String[] args) {

		Member member = new Member();
		
		member.setId("user01");
		member.setPwd("1234");
		member.setNickName("nick01");
		member.setGender('M');
		member.setEmail("helloWorld@naver.com");
		member.setAddress("우리집123");
		
		System.out.println(member.getId());
		System.out.println(member.getPwd());
		System.out.println(member.getNickName());
		System.out.println(member.getEmail());
		System.out.println(member.getAddress());
		System.out.println(member.getGender());
		
	}//main

}//class



















