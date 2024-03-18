package bank;

public class Account {
	
	public Account() {
		double x = Math.random() * 9000000000L + 1000000000;
		long result = (long)x;
		this.number = String.valueOf(result);
	}
	
	public Account(String name, String pwd) {
		this.name = name;
		this.pwd = pwd;
	}
	
	public Account(String name, String pwd, int limit) {
		this.name = name;
		this.pwd = pwd;
		this.limit = limit;
	}

	public Account(String name, String pwd, String number, int balance, int failCnt, int limit) {
		this.name = name;
		this.pwd = pwd;
		this.number = number;
		this.balance = balance;
		this.failCnt = failCnt;
		this.limit = limit;
	}

	public String toString() {
		return "Account [name=" + name + ", pwd=" + pwd + ", number=" + number + ", balance=" + balance + ", failCnt="
				+ failCnt + ", limit=" + limit + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getFailCnt() {
		return failCnt;
	}

	public void setFailCnt(int failCnt) {
		this.failCnt = failCnt;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	private String name; // 예금주
	private String pwd; // 비밀번호
	private String number; // 계좌번호
	private int balance; // 잔액
	private int failCnt; // 비밀번호 실패 횟수
	private int limit; // 출금,이체 한도

}
