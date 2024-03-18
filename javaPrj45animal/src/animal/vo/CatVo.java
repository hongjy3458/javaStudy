package animal.vo;

public class CatVo extends AnimalVo {
	
	public CatVo() {
		setName("고양이");
		setLifeSpan("11년");
		setHabitat("자동차밑");
	}

	public void cry() {
		System.out.println("야옹");
	}

}
