package vo;

public class Movie {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	@Override
	public String toString() {
		return "Movie [name=" + name + ", ageLimit=" + ageLimit + "]";
	}
	public Movie(String name, int ageLimit) {
		super();
		this.name = name;
		this.ageLimit = ageLimit;
	}
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int ageLimit;

}
