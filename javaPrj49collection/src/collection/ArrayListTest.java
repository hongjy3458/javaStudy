package collection;

import java.util.ArrayList;
import java.util.Iterator;

import kh.KhArrayList;

public class ArrayListTest {
	
	//ArrayList
	public void m01() {
		
		System.out.println("-----ArrayList-----");
		
		//어레이 리스트 생성
		ArrayList x = new ArrayList();
		
		//데이터 넣기
		x.add(3.14);
		x.add("two");
		x.add(30);
		x.add('a');
		x.add(true);
		x.add('a');
		
		// ???
//		x.remove(2);
//		x.remove("two");
//		x.clear();
//		System.out.println( "어떻게 나오나 ??? : " + x.contains("abc") );
//		System.out.println( "어떻게 나오나 ??? : " + x.indexOf('a') );
//		System.out.println( "비었나 ??? : " + x.isEmpty() );

		//모든 데이터 출력
		for (Object elem : x) {
			System.out.println(elem);
		}
		
	}//method
	
	
	public void m02() {
		
		// 리스트 만들기
		KhArrayList list = new KhArrayList();
		
		// 데이터 넣기
		list.add("one");
		list.add(222);
		list.add('a');
		list.add(true);
		list.add(3.14);
		list.add("zzzz");
		list.add("aaaaaaaa");

		list.add( 3 , "삼삼삼");
//		list.remove(2);
//		list.clear();
		
		// 데이터 꺼내기
		for(int i = 0 ; i < list.size(); i++) {
			System.out.println( list.get(i) );
		}
		
//		list.add("clear이후에 처음 넣은 데이터~~~");
//		System.out.println( list.get(0) );
		
	}//method
	
	
	

}//class





























