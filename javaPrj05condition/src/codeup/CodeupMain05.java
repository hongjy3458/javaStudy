package codeup;

public class CodeupMain05 {

	public static void main(String[] args) {
		
//		정수타입 변수 x에 값을 입력하고, 
//		x 가 90 이상이면 "A" 출력
//		x 가 80 이상 90미만 이면 "B" 출력
//		x 가 70 이상 80미만 이면 "C" 출력
//		x 가 60 이상 70미만 이면 "D" 출력
//		x 가 60 미만이면 "F" 출력
		
		int x = 100;
		
		if(x >= 90) {
			System.out.println("A");
		}else if(x >= 80) {
			System.out.println("B");
		}else if(70 <= x) {
			System.out.println("C");
		}else if(60 <= x) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
		
		
		
	}

}
