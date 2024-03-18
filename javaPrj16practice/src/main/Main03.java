package main;

import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {

//		정수1개 입력받고
//		7의 배수인지 판단하여
//		7의배수맞음 / 7의배수아님
//		출력하기
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x % 7 == 0) {
			System.out.println("7의배수맞음");
		}else {
			System.out.println("7의배수아님");
		}
		
		
	}

}
