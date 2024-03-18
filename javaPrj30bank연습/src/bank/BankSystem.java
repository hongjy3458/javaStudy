package bank;

import java.util.Scanner;

public class BankSystem {
	
	private final Scanner sc = new Scanner(System.in);
	
//	public BankSystem() {
//		this.sc = new Scanner(System.in);
//	}

	//잔액조회
	public void selectBalance( AccountInfo x ) {
		System.out.println( x.getName() + "의 잔액 : " +  x.getBalance() + "원" );
	}
	
	//입금하기
	public void plus(AccountInfo x) {
		System.out.print("입금 금액 : ");
		int value = scanNumber();
		x.setBalance(x.getBalance() + value);
		System.out.println("입금 완료 ! " + value +"원");
	}
	
	//출금하기
	public void minus(AccountInfo x) {
		selectBalance(x);
		System.out.print("출금 금액 : ");
		int value = scanNumber();
		
		boolean isOk = checkPwd(x);
		if(!isOk) {
			System.err.println("[출금 실패] 비밀번호 불일치");
			return;
		}
		
		if(x.getBalance() < value) {
			System.err.println("[출금 실패] 잔액이 부족합니다.");
			return;
		}
		x.setBalance( x.getBalance() - value );
		System.out.println("출금 완료 ! " + value + "원");
	}//minus
	
	//비밀번호 검사
	private boolean checkPwd( AccountInfo x ) {
		System.out.print("비밀번호 : ");
		String userInputPwd = sc.nextLine();
		if( x.getPwd().equals(userInputPwd) ) {
			return true;
		}
		return false;
	}
 
	//메뉴 보여주기
	public int showMenu() {
		System.out.println("=====심한은행=====");
		System.out.println("0. 종료하기");
		System.out.println("1. 잔액조회");
		System.out.println("2. 입금하기");
		System.out.println("3. 출금하기");
		System.out.print("번호 입력 : ");
		
		int userInputNumber = scanNumber();
		return userInputNumber;
	}
	
	//숫자 받기
	private int scanNumber() {
		String str = sc.nextLine(); 
		int num = Integer.parseInt(str);
		return num;
	}

}//class







