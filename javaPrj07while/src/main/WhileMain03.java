package main;

public class WhileMain03 {

	public static void main(String[] args) {
		
//		1 ~ 100 사이의 숫자 중
//		7의 배수만 출력
		
		int num = 1;
		while(num <= 100) {
			if(num % 7 == 0) {
				System.out.println(num);
			}
			num = num + 1;
		}

	}

}
