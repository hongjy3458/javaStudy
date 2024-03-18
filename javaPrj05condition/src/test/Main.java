package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 제어문 (조건문)

		/*
		 * if, else, else if
		 * 
		 * if : 조건식의 결과값이 true 이면, 실행내용 ㄱㄱ 조건식의 결과값이 false 이면, 실행내용 ㄴㄴ
		 * else : if 뒤에 작성할 수 있음. 앞의 조건을 통과하지 못하면 실행됨.
		 * else if : if 뒤에 작성할 수 있음. 앞의 조건을 통과하지 못하면 조건식 검사함. 
		 * 
		 * 
		 * <문법> if(조건식){실행내용}
		 * 
		 * 
		 * 
		 */

		System.out.println("===== 제어문 =====");

		Scanner sc = new Scanner(System.in);	// 입력받을 준비 == 입력받을 도구 생성

		while(true) {
			int x = sc.nextInt();					// 입력받기 == 도구사용하여 입력받음

			// x 값이 양수이면, 플러스 라고 출력
			// x 값이 음수이면, 마이너스 라고 출력

			if (x > 0) {
				System.out.println("플러스");
			} else if (x == 0) {
				System.out.println("제로");
			} else {
				System.out.println("마이너스");
			}

		}
		
		
		
		
		

	}

}











