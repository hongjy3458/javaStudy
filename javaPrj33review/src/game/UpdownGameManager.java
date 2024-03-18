package game;

import main.Main;

public class UpdownGameManager {

	public void gameStart() {
		
		//업다운 게임
		
		//1. 정답 준비 (랜덤값 1~100)
		int answer = (int)(Math.random() * 100 + 1);
		
		while(true) {
			//2. 안내문구 출력 (1~100 사이의 숫자를 입력하세요)
			System.out.print("1~100 사이의 정수 입력 : ");
			
			//3. 유저 입력 받기
			int userInput = Main.sc.nextInt();
			
			//4. 입력받은 값 판단하기 (업,다운,정답)
			if(userInput == answer) {
				System.out.println("정답");
				break;
			}else if(userInput < answer) {
				System.out.println("UP");
			}else if(userInput > answer) {
				System.out.println("DOWN");
			}
		}
		
		//5. 판단 결과에 따라 
		// - 안내문구 출력 (업)		=> 2번부터 반복 
		// - 안내문구 출력 (다운)	=> 2번부터 반복 
		// - 안내문구 출력 (정답)	=> 프로그램 종료 == 메인메소드 종료

		
	}//method

}//class
