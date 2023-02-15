package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {

	@SuppressWarnings("all")// 추천 x
	public static void main(String[] args) {
		Collection coll = new ArrayList();
//		Collection<Object> coll = new ArrayList<Object>();
		
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이");//중복도 허용
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		//warning error - 항목을 한정되지 않아 오류 발생 가능성 경고 ->@SuppressWarnings
		//->해결 방법 generic 하기 <Object>
		// collection이 get()함수가 없으며 arraylist에만 get이용가능 대안
		Iterator it = coll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//항목 다꺼내기
		
		//it.hasNext() 항목이 있는지 -있으면 true , 없으면 false
		//it.next() 항목을 꺼내고 다음 항목으로 이동
	}

}
/*인터페이스 Collection을 사용하려면
1. implements 
- 모든 추상메소드를 override
2. 대신 override 해주는 클래스 (우체국 택배 역할)-interface를 대신 가져옴
3. 메소드  Iterator<E>:Iterator 라는 interface 생성
Iterator it = coll.iterator();
*/