package animal;

public class Dog extends Animal {
	
	public Dog() {
		super("zzz" , 20);
	}

	public String name = "강아지";
	public int age;
	
	public void introduce() {
		System.out.println("제 이름은 " + this.name + " 입니다.");
		System.out.println("제 이름은 " + super.name + " 입니다.");
	}

	@Override
	public void cry() {
		System.out.println("멍멍");
	}

}
						
						