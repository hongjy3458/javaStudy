package car;

public class Gbagen implements CarActionGasoline {

	@Override
	public void goGasoline() {
		System.out.println("지바겐 기름으로 출발 ~");
	}
	
	@Override
	public void stop() {
		System.out.println("지바겐 멈춤");
	}

}
