package main;

public class Pokemon {
	
	
	
	public Pokemon() {

	}

	//매개변수 있는 생성자
	public Pokemon(String name, int hp, int atk) {
		//객체 생성
		this.name = name; 
		this.hp = hp;
		this.atk = atk;
		//객체 리턴
	}
	
	
			
	String name;
	int hp;
	int atk;
	
	public void bodyAttack() {
		System.out.println(this.name + "의 몸통 박치기 ~ !");
	}
	

}//class










