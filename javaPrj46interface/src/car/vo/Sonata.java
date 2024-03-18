package car.vo;

public class Sonata extends Car implements CarAction {

	@Override
	public void go() {
		System.out.println("소나타 출발 ~~~");
	}

	@Override
	public void stop() {
		System.out.println("소나타 멈춤 !!!");		
	}

	
	
	
}
