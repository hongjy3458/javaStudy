package animal.vo;

public class DogVo extends AnimalVo {
	
	public DogVo() {
		setName("강아지");
		setLifeSpan("10년");
		setHabitat("우리집");
	}
	
	public void cry() {
		System.out.println("멍멍");
	}

}
