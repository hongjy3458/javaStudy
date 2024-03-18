package car;

public class Tesla implements CarActionElec {


	@Override
	public void goElec() {
		System.out.println("테슬라 전기로 ㄱㄱ");
	}
	
	@Override
	public void stop() {
		System.out.println("테슬라 멈춤");
	}

}
