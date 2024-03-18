package subway;

import util.KhScanner;

public class SubwaySystyem {
	
	public static Subway[] subwayArray = new Subway[100];
	public static int cnt = 0;	//역 갯수
	
	// 메인메뉴
	public boolean showMenu() {
		System.out.println("0. 종료하기");
		System.out.println("1. 신규등록");
		System.out.println("2. 목록조회");
		System.out.println("3. 상세조회");
		
		int inputNum = KhScanner.scanInt();
		switch(inputNum) {
		case 0 : 
			System.out.println("프로그램 종료...");
			return true;
		case 1 : 
			enroll();
			break;
		case 2 : 
			showList();
			break;
		case 3 :
			showDetail();
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		}
		return false;
	}//method
	
	// 역 신규 등록
	public void enroll() {
		System.out.println("----- 신규 등록 -----");
		
		//입력받기
		System.out.print("역 이름 : ");
		String name = KhScanner.scanString();
		System.out.print("호선 : ");
		String line = KhScanner.scanString();
		System.out.print("환승여부(true/false) : ");
		boolean isTransfer = KhScanner.scanBoolean();
		System.out.print("내리는 문(R/L) : ");
		char door = KhScanner.scanChar();
		System.out.print("사이즈 : ");
		int size = KhScanner.scanInt();
		
		//객체 만들기
		Subway subway = new Subway();
		subway.setName(name);
		subway.setLine(line);
		subway.setTransfer(isTransfer);
		subway.setDoor(door);
		subway.setSize(size);
		
		//저장
		subwayArray[SubwaySystyem.cnt] = subway;
		SubwaySystyem.cnt++;
		
		System.out.println("입력된 지하철 정보 : " + subway);
		
	}//method
	
	
	// 역 목록 조회
	public void showList() {
		System.out.println("----- 목록 조회 -----");
		
		for(int i = 0 ; i < SubwaySystyem.cnt; ++i) {
			System.out.println(i + "번 : " + subwayArray[i].getName()  );
		}//for
		
	}//method
	
	
	// 역 상세 조회
	public void showDetail() {
		
		System.out.println("----- 상세 조회 -----");
		showList();
		System.out.print("조회할 역 번호 : ");
		int num = KhScanner.scanInt();
		
		System.out.println( "역 이름	: " + subwayArray[num].getName() );
		System.out.println( "호선		: " + subwayArray[num].getLine() );
		System.out.println( "사이즈	: " + subwayArray[num].getSize() );
		System.out.println( "내리실문	: " + subwayArray[num].getDoor() );
		
	}//method

}//class









