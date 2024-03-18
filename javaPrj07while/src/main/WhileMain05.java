package main;

public class WhileMain05 {

	public static void main(String[] args) {
		
//		1 ~ 100 사이의 숫자를 출력
//		(단, 7의 배수는 숫자 대신 "lucky" 라고 출력)
		
		int num = 1;
		while(num <= 100) {
			
			if(num % 7 == 0) {
				System.out.println("lucky");
			}else {
				System.out.println(num);
			}
			
			num = num + 1;
		}

	}

}









