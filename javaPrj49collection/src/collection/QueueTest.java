package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	
	public void method01() {
		
		// 생성
		Queue x = new LinkedList();
		
		// 넣기
		x.add("one");
		x.add("two");
		x.add("three");
		
		// ???
		
		// 꺼내기
		System.out.println( x.poll() );
		System.out.println( x.poll() );
		System.out.println( x.poll() );
		
	}//method

}//class











