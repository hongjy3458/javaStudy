package main;

import java.util.ArrayList;

import vo.Movie;

public class Main {

	public static void main(String[] args) {
		
		//영화 등록
		ArrayList list = new ArrayList();
		list.add( new Movie("파묘" , 19) );
		list.add( new Movie("해리포터" , 15) );
		list.add( new Movie("반지의제왕" , 0) );
		
		//영화 목록
		for (Object x : list) {
			System.out.println(x);
		}
		
	}//main

}//class






