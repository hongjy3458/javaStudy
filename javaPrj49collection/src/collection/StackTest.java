package collection;

import java.util.Stack;

public class StackTest {
	
	public void method01() {
		
		// Stack 만들기
		Stack s = new Stack();
		
		// 데이터 넣기
		s.push("one");
		s.push("two");
		s.push("three");
		
		// ???
//		s.clear();
		
		// 데이터 꺼내기
		System.out.println( s.peek() );
		System.out.println( s.pop() );
		System.out.println( s.pop() );
		
	}//method

}//class






















