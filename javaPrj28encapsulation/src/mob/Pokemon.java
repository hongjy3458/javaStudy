package mob;

public class Pokemon {
	
	private String name;
	private int hp;
	private int atk;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHp(int hp ) {
		this.hp = hp;
	}
	
	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getHp() {
		return hp;
	}
	
	public int getAtk() {
		return atk;
	}
	
	public void bodyAttack() {
		System.out.println(name + " 의 몸통 박치기 !!!");
	}//bodyAttack

}//class
