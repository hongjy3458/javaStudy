package animal;

import java.util.ArrayList;
import java.util.Iterator;

import animal.vo.AnimalVo;
import animal.vo.CatVo;
import animal.vo.DogVo;
import animal.vo.TigerVo;
import main.Main;

public class AnimalController {
	
	public AnimalController() {
		createAnimal();
	}
	
	public static final AnimalVo[] animalArr = new AnimalVo[3];
	
	//전체메뉴
	public boolean printMenu() {
		System.out.println("0. 종료하기");
		System.out.println("1. 동물등록");
		System.out.println("2. 동물목록");
		System.out.println("3. 상세조회");
		System.out.println("4. 울음소리 듣기");
		System.out.print("메뉴 번호 입력 : ");
		String num = Main.SC.nextLine();
		
		switch(num) {
		case "0" : System.out.println("프로그램을 종료합니다."); return true;
		case "1" : createAnimal(); break;
		case "2" : printList(); break;
		case "3" : printAnimal(); break;
		case "4" : listen(); break;
		default: System.out.println("잘못된 번호입니다.");
		}
		
		return false;
	}//method
	
	//동물도감 데이터 로딩
	public void createAnimal() {
		
		DogVo dog = new DogVo();
		CatVo cat = new CatVo();
		TigerVo tiger = new TigerVo();
		
		animalArr[0] = dog;
		animalArr[1] = cat;
		animalArr[2] = tiger;
		
	}
	
	//동물목록
	public void printList() {
		int n = 0;
		System.out.println("\n\n\n--------------------");
		for(AnimalVo x : animalArr) {
			System.out.println(n + "번 : " +  x.getName() );
			System.out.println();
			n++;
		}
		System.out.println("--------------------\n\n\n");
	}//method
	
	
	//상세조회
	public void printAnimal() {
		
		System.out.print("조회할 동물 번호 : ");
		int n = Integer.parseInt(Main.SC.nextLine());
		
		AnimalVo x = animalArr[n];
		
		System.out.println("이름 : " + x.getName() );
		System.out.println("수명 : " + x.getLifeSpan() );
		System.out.println("서식지 : " + x.getHabitat() );
		System.out.println();	//줄바꿈 == 공백 추가
		
	}
	
	//울음소리 듣기
	public void listen() {
		
		System.out.print("울음소리 들을 동물 번호 :");
		int num = Integer.parseInt(Main.SC.nextLine());
		
		AnimalVo x = animalArr[num];
		x.cry();
		
	}//method
	
	
	
	
	public static void main(String[] args) {
		AnimalVo x = new DogVo();
		
		if( x instanceof Object ) {
			System.out.println("ooo");
		}else {
			System.out.println("xxx");
		}
		
		
	}
	
	
	
}//class












