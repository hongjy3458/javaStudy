package test;

public class Pokemon {
	
	//기본생성자
	public Pokemon() {
		
	}
	
	//AllArgsConstructor
	public Pokemon(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	//접근제한자
	private String name;
	private int hp;
	private int atk;
	public String getName() {
		return name;
	}

	//getter/setter
	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	
	//toString
	public String toString() {
		return "Pokemon [name=" + name + ", hp=" + hp + ", atk=" + atk + "]";
	}
	
	
	
}

