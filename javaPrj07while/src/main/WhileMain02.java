package main;

public class WhileMain02 {

	public static void main(String[] args) {
		
//		자연수 x 를 입력받고,
//		0 부터 x 까지 2씩 증가시키며 출력

		int x = 7;
		int num = 0;
		while(num <= x) {
			System.out.println(num);
			num = num+2;
		}
		
	}

}
