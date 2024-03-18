package bank;

import java.util.Iterator;

import util.input.MyScanner;

public class BankSystem {
	
	private static Account[] ACCOUNT_ARRAY = new Account[100];
	private static int cnt = 0;
	
	// 메인메뉴
	public boolean showMenu() {
		System.out.println("===== 메인메뉴 =====");
		System.out.println("0. 종료하기");
		System.out.println("1. 계좌개설");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		System.out.print("메뉴 번호 : ");
		int num = MyScanner.scanInt();
		
		switch(num) {
			case 0 :
				System.out.println("프로그램 종료...");
				return true;
			case 1 :
				createAccount();
				break;
			case 2 :
				showAccountList();
				break;
			case 3 :
				showAccountDetail();
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
		}//switch
		return false;
	}//method
	
	// 계좌개설
	private void createAccount() {
		//입력받기
		System.out.println("----- 계좌 개설 -----");
		System.out.print("예금주 : ");
		String name = MyScanner.scanString();
		System.out.print("비밀번호 : ");
		String pwd = MyScanner.scanString();
		System.out.print("이체한도 : ");
		int limit = MyScanner.scanInt();
		
		//데이터 뭉치기 (객체생성)
		Account x = new Account();
		x.setName(name);
		x.setPwd(pwd);
		x.setLimit(limit);
		
		//저장하기
		ACCOUNT_ARRAY[cnt] = x;
		cnt++;
		
		//안내문구
		System.out.println("저장 완료 !");
		
	}//method
	
	// 목록조회
	private void showAccountList() {
		System.out.println("----------계좌 목록----------");
		for (int i = 0; i < cnt; i++) {
			System.out.println( i + "번 " + ACCOUNT_ARRAY[i].getName() );
		}
		System.out.println("---------------------------");
	}//method
	
	// 상세조회
	private void showAccountDetail() {
		showAccountList();
		System.out.print("조회할 번호 : ");
		int num = MyScanner.scanInt();
		System.out.println( "예금주 : " + ACCOUNT_ARRAY[num].getName() );
		System.out.println( "계좌번호 : " + ACCOUNT_ARRAY[num].getNumber() );
		System.out.println( "잔액 : " + ACCOUNT_ARRAY[num].getBalance() );
		System.out.println( "비밀번호 실패 횟수 : " + ACCOUNT_ARRAY[num].getFailCnt() );
		System.out.println( "출금,이체 한도 : " + ACCOUNT_ARRAY[num].getLimit() );
		
		printDetailMenu(ACCOUNT_ARRAY[num]);
	}
	
	// 상세조회 메뉴
	public void printDetailMenu(Account account) {
		System.out.println("---------- 상세 메뉴 ----------");
		System.out.println("0. 돌아가기");
		System.out.println("1. 입금하기");
		System.out.println("2. 출금하기");
		int num = MyScanner.scanInt();
		
		switch(num) {
		case 0 :
			System.out.println("돌아가기...");
			return;
		case 1 :
			plus(account);
			break;
		case 2 :
			minus(account);
			break;
		default :
			System.out.println("잘못된 입력입니다.");
		}//switch
	}//method
	
	
	// 상세조회 메뉴 -> 입금
	public void plus(Account account) {
		System.out.println("----- 입금 -----");
		System.out.print("입금할 금액 : ");
		int value = MyScanner.scanInt();
		account.setBalance( account.getBalance() + value );
		System.out.println(value + " 원 입금완료 !");
		System.out.println("잔액 : " + account.getBalance());
	}
	
	// 상세조회 메뉴 -> 출금
	public void minus(Account account) {
		System.out.println("----- 출금 -----");
		
		if( account.getFailCnt() >= 5 ) {
			System.out.println("비번 실패 5번,,,계좌잠겼음...은행 ㄱㄱ");
			return;
		}
		
		System.out.print("출금할 금액 : " );
		int value = MyScanner.scanInt();
		
		System.out.print("비밀번호 : ");
		String inputPwd = MyScanner.scanString();
		if(!inputPwd.equals(account.getPwd())) {
			System.out.println("비밀번호 틀림");
			account.setFailCnt( account.getFailCnt() + 1 );
			return;
		}
		account.setFailCnt(0);
		account.setBalance( account.getBalance() - value );
		System.out.println(value + "원 출금완료 !");
		System.out.println("잔액 : " +  account.getBalance());
	}
	
	
	
	
	// 이체
	
}//class





















