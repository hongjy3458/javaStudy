package animal;

public abstract class Animal {
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected String name = "애니멀";
	public int age;
	
	public abstract void cry();

}
