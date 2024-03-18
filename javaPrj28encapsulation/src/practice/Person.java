package practice;

public class Person {
	
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void sayHello() {
		System.out.println("안녕하세요 저는 " + name + " 입니다.");
	}

}//class
