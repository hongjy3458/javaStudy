package car.vo;

public class AvanteHybrid extends Car implements CarAction , CarActionElec  {

	@Override
	public void go() {
		System.out.println("아반떼 출발 ~~~");
	}

	@Override
	public void stop() {
		System.out.println("아반떼 멈춤 !!!");
	}

	@Override
	public void goElec() {
		System.out.println("아반떼 전기로 출발 ~~~");
	}

	@Override
	public void stopElec() {
		System.out.println("아반떼 전기로 멈춤 !!!");		
	}

}
