package main;

public class WhileMain06 {

	public static void main(String[] args) {
		
//		1이상 10이하 의 모든 숫자의 합을 출력
		
		int sum = 0;
		
		int x = 1;
		while(x <= 10) {
			sum = sum + x;
			x = x+1;
		}
		
		System.out.println(sum);
		
		

	}

}
