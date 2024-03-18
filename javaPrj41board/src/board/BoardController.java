package board;

import main.Main;

public class BoardController {
	
	public static final BoardVo[] BOARD_VO_ARR = new BoardVo[100];
	public static int cnt = 0;
	
	// 게시판 메뉴
	public boolean printMenu() {
		System.out.println("===== BOARD MENU =====");
		System.out.println("0. 종료하기");
		System.out.println("1. 게시글 작성");
		System.out.println("2. 게시글 목록 조회");
		System.out.println("3. 게시글 상세 조회");
		System.out.print("메뉴 번호 : ");
		String num = Main.SC.nextLine();
		switch(num) {
		case "0" : System.out.println("프로그램 종료"); return true;
		case "1" : insertBoard(); break;
		case "2" : selectBoardList(); break;
		case "3" : selectBoardDetail(); break;
		default : System.out.println("잘못된 입력입니다.");
		}//switch
		return false;
	}//method
	
	
	// 게시글 작성
	private void insertBoard() {
		
		//입력받기
		System.out.println("-----INSERT BOARD-----");
		System.out.print("제목	: ");
		String title = Main.SC.nextLine();
		System.out.print("내용	: ");
		String content = Main.SC.nextLine();
		System.out.print("작성자	: ");
		String writerNick = Main.SC.nextLine();
		
		//데이터 뭉치기
		BoardVo vo = new BoardVo();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriterNick(writerNick);
		
		//저장하기
		BOARD_VO_ARR[cnt] = vo;
		cnt++;
		
		//결과
		System.out.println("게시글 작성 완료 !");
		
	}//method
	
	// 게시글 목록 조회
	private void selectBoardList() {
		System.out.println("-----BOARD LIST-----");
		for(int i = 0 ; i < cnt; ++i) {
			System.out.println(i + " 번 " + BOARD_VO_ARR[i].getTitle());
		}
		System.out.println("--------------------");
		
		System.out.println("0. 돌아가기");
		System.out.println("1. 상세조회");
//		System.out.println("2. 수정하기");
//		System.out.println("3. 삭제하기");
		System.out.print("메뉴 번호 : ");
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "0" : System.out.println("이전 메뉴로 돌아가기..."); return; 
		case "1" : selectBoardDetail(); break;
//		case "2" : editBoard(); break;
//		case "3" : deleteBoard(); break;
		default : System.out.println("잘못된 입력입니다.");
		}
		
	}//method
	
	// 게시글 상세 조회
	private void selectBoardDetail() {
		
		System.out.print("상세조회할 게시글 번호 : ");
		int x = Integer.parseInt(Main.SC.nextLine());
		
		System.out.println("----------상세조회----------");
		System.out.println("제목		: " + BOARD_VO_ARR[x].getTitle());
		System.out.println("작성자	: " + BOARD_VO_ARR[x].getWriterNick());
		System.out.println("내용		: " + BOARD_VO_ARR[x].getContent());
		System.out.println("-------------------------");
		
		System.out.println("수정하실래요?(yes / no)");
		String str = Main.SC.nextLine();
		if(str.equals("yes")) {
			updateBoard(BOARD_VO_ARR[x]);
		}
		
	}//method
	
	private void updateBoard(BoardVo vo) {
		System.out.println("변경할 내용을 입력하세요 : ");
		String str = Main.SC.nextLine();
		
		vo.setContent(str);
		System.out.println("변경 완료 !");
	}

}//class









