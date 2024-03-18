package main;

public class Person {
	
	//기본 생성자 == 매개변수 없는 생성자 == 자동으로 만들어짐(단, 아무 생성자도 없을 때)
	public Person() {
		//객체 생성 (자동)
		//객체 리턴 (자동)
	}
	
	//생성자 (매개변수 있는 생성자)
	public Person(int x) {
		System.out.println("전달받은 정수 : " + x);
	}
	
	//멤버 변수
	String name;
	int age;
	
	//멤버 메소드
	public void hello() {
		System.out.println("안녕ㅋㅋ");
	}

}//class
