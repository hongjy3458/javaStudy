package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//중복 ㄴㄴ
//순서 ㄴㄴ
public class SetTest {
	
	public void method01() {
		
		// 생성
		Set s = new HashSet();
		
		// 데이터 넣기
		s.add("one");
		s.add("one");
		s.add("one");
		s.add("two");
		s.add(333);
		
		// ???
//		System.out.println( s.size() );
//		s.clear();
//		System.out.println("포함 ??? " + s.contains("444") );
		
		// 데이터 꺼내기
		System.out.println( s );
		
		Iterator iter = s.iterator();
		while( iter.hasNext() ) {
			System.out.println( iter.next() );
		}
		
	}//method

}//class























