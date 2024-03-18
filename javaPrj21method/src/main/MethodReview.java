package main;

public class MethodReview {
	
	public void m01() {
		System.out.println("메소드01 시작 ~~~");
		m01();
		System.out.println("메소드01 종료 ~~~");
	}
	
	public void m02() {
		System.out.println("메소드02 시작 ~~~");
		m03();
		System.out.println("메소드02 종료 ~~~");
	}
	
	public void m03() {
		System.out.println("메소드03 시작 ~~~");
		System.out.println("메소드03 종료 ~~~");
	}

}




		
		
		