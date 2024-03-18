package car.vo;

public class Avante extends Car implements CarAction {

	@Override
	public void go() {
		System.out.println("아반떼 출발 ~~~");
	}

	@Override
	public void stop() {
		System.out.println("아반떼 멈춤 !!!");		
	}

}
