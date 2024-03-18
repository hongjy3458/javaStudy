package collection;

import java.util.ArrayList;
import java.util.HashMap;

import vo.Person;

//key - value
//key 는 중복 안됨
//value 는 중복 가능
//순서 없음
public class MapTest {
	
	public void method01() {
		
//		//ArrayList 생성
//		ArrayList<Person> list = new ArrayList<Person>();
//		
//		//데이터 넣기 (Person 3명)
//		list.add( new Person("홍길동", 20, 183.7, 66.7) );
//		list.add( new Person("김철수", 30, 173.2, 42.7) );
//		list.add( new Person("김영희", 40, 199.9, 33.7) );
//		
//		//데이터 꺼내기 (이름이 홍길동)
//		for (Person temp : list) {
//			if(temp.getName().equals("홍길동")) {
//				System.out.println(temp);
//				break;
//			}
//		}
		
		
		//생성
		HashMap m = new HashMap();
		
		//데이터 넣기
		m.put("홍길동", new Person("홍길동", 20, 183.7, 66.7));
		m.put("김철수", new Person("김철수", 30, 173.2, 42.7));
		m.put("김영희", new Person("김영희", 40, 199.9, 33.7));
		
		
		// ???
//		m.clear();
//		m.remove("김철수");
//		System.out.println( "비었나 ???  " + m.isEmpty() );
		
		//데이터 꺼내기 
		System.out.println( m.getOrDefault("김수한무너구리와두루미" , "김무명") ); // ?????????????
		
	}//method

}//class







