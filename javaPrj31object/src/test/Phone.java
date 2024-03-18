package test;

public class Phone {
	
	//데이터
	public String number;
	public String name;
	public int battery;
	public String color;
	public int price;
	public int volume;
	public int version;
	
	//기능
	public void call(){
		System.out.println("전화거는중...");
	}
	
	public void powerOff(){
		System.out.println("전원끄기");
	}
	
	public void volumeUp() {
		System.out.println("소리 키움");
	}
	
	public void volumeDown() {
		System.out.println("소리 감소");
	}
	
	public void versionUpdate() {
		System.out.println("버전 업데이트");
	}

}







