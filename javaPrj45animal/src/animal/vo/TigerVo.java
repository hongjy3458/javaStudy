package animal.vo;

public class TigerVo extends AnimalVo {
	
	public TigerVo() {
		setName("호랑이");
		setLifeSpan("15년");
		setHabitat("백두산");
	}

	public void cry() {
		System.out.println("어흥");
	}
	
}
