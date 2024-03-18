package bank;

public class AccountInfo {
	
	public AccountInfo(String name, String number, String pwd, int balance, int limit) {
		this.name = name;
		this.number = number;
		this.pwd = pwd;
		this.balance = balance;
		this.limit = limit;
	}
	
	private String name;
	private String number;
	private String pwd;
	private int balance;
	private int limit;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}	
	
	

}












