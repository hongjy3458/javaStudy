package mob;

public class Pokemon {
	
	private String name;
	private int hp;
	private int atk;
	
	public void m01(int num) {
		this.hp = num;
	}
	
	public void bodyAttack() {
		System.out.println(this.name + " 의 몸통 박치기 ~ !");
	}

}//class
