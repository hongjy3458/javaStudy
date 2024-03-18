package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	
	public void m01() {
	
		// 컬렉션 준비
		List x = new LinkedList();
		
		// 데이터 넣기
		x.add("one");
		x.add(22222);
		x.add(3.14);
		x.add('z');
		x.add("hello");
		
		// 데이터 꺼내기
		for (Object elem : x) {
			System.out.println(elem);
		}
		
	}//method

}//class



