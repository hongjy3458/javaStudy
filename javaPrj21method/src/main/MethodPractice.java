package main;

public class MethodPractice {
	
	// 헬로 월드 라고 출력하는 메소드 만들기 //메소드 이름은 printHello
	public void printHello() {
		System.out.println("헬로월드~~~");
	}
	
	/*
	 * 전달받는 인자값 없음
	 * 리턴값 없음
	 * 메소드 이름은 sayHi
	 * 실행내용 : Hi 라고 출력
	 */
	public void sayHi() {
		System.out.println("hi");
	}
	
	/*
	 * 인자값 : 없음
	 * 리턴값 : 없음
	 * 이름 : judgeNumber
	 * 실행내용 : 정수타입변수 x 에 아무 값이나 집어넣고, 양수/음수/0 판단하기 
	 */
	public void judgeNumber() {
		int x = 10;
		if(x == 0) {
			System.out.println("zero");
		}else if(x > 0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
	}
	
	/*
	 * 인자값 : 없음
	 * 리턴값 : 없음
	 * 이름 : printNumbers
	 * 실행내용 : 숫자 1 ~ 100 까지 출력하기 
	 */
	public void printNumbers() {
		for(int i = 1; i<=100; ++i) {
			System.out.println(i);
		}
	}
	
	
	/*
	 * 인자값 : 정수
	 * 리턴값 : 없음
	 * 이름 : printNumbers
	 * 실행내용 : 숫자 1 ~ 인자로받은정수 까지 출력하기  
	 */
	public void printNumbers(int x) {
		for(int i = 1; i <= x; ++i) {
			System.out.println(i);
		}
	}
	
	/*
	 * 인자값 : 정수 정수
	 * 리턴값 : 없음
	 * 이름 : plus
	 * 실행내용 : 인자로 받은 정수 2개 더한 값 출력하기  
	 */
	public void plus(int a , int b) {
		System.out.println(a+b);
	}
	
	/*
	 * 인자값 : 정수 정수
	 * 리턴값 : 정수
	 * 이름 : getPlusResult
	 * 실행내용 : 인자로 받은 정수 2개 더한 값 리턴하기  
	 */
	public int getPlusResult(int a , int b) {
		return a+b;
	}

}//class

















