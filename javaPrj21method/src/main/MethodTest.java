package main;

public class MethodTest {
	
	/*
	 * [문법]
	 * 접근제한자 리턴타입 메소드명(매개변수){ 
	 * 	실행내용 
	 * }
	 */
	
	// 인자값X 반환값X
	public void m01() {
		
		System.out.println("복잡한 작업111 ~~~");
		System.out.println("복잡한 작업222 ~~~");
		System.out.println("복잡한 작업333 ~~~");
		System.out.println("복잡한 작업444 ~~~");
		System.out.println("복잡한 작업555 ~~~");
		
	}//m01
	
	// 인자값O 반환값X
	public void m02( int a , int b , String c ) {
		
		System.out.println("이름 : " + c);
		System.out.println("나이 : " + (a+b) );
		
	}//m02

	
	
	// 인자값X 반환값O
	public int m03() {
		
		int x = 10;
		int y = 20;
		int result = x+y;
		return result;
		
	}//m03
	
	
	// 인자값O 반환값O
	public int plus(int a, int b) {
		return a+b;
	}//plus
	

}//class
















