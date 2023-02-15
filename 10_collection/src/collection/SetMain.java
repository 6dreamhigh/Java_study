package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		//set은 HashSet /TreeSet 을 통해 interface를 대신 가져옴
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이");//중복도 허용 안됨, 순서 없음

		set.add("기린");
		set.add("코끼리");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//항목 다꺼내기
	}

}
/*
호랑이
코끼리
기린
사자  
-> set은 순서가 없음 */