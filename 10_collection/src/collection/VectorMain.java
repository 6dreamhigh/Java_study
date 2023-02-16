package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class VectorMain {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = "+v.size());//0
		System.out.println("벡터 용량 = "+v.capacity());//기본용량 10,10개씩 증가
		System.out.println();
		
		System.err.println("항목 추가");
		for(int i =0;i <10;i++) {
			v.add(i+1+"");
			System.out.print(v.get(i)+" ");
		}
		System.out.println();
		System.out.println("벡터 크기 = "+v.size());//0
		System.out.println("벡터 용량 = "+v.capacity());//기본용량 10,10개씩 증가
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5+ "");//중복 허용
		System.out.println("벡터 크기 = "+v.size());//벡터 크기 = 11
		System.out.println("벡터 용량 = "+v.capacity());//벡터 용량 = 20
		System.out.println();
		
		for(int i =0;i<v.size();i++)System.out.print(v.get(i)+" ");
		System.out.println();
		
		
		System.out.println("마지막 항목 삭제");
		v.remove(10);//삭제(인덱스)
//		v.remove("5");//앞부분의 5가 삭제됨
		
		Iterator it = v.iterator();
		//iterator는 인터페이스여서 객체 생성 x->메소드를 통해 인터페이스 생성
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");//버퍼에서 꺼내고 다음 항목으로 이동
		}//항목 다꺼내기
	}
	
			
}

/*
 *interface
 *1.implements 
 *모든 추상메소드를 Override
 *2. 대신 추상메소드를 Override 해주는 클래스
 *3. 메소드
 *4. 익명 Inner 클래스 사용 (키다리 아저씨가 추상 메소드를 override 대신 해줌)
 *->일회용 한번 쓰고 버림 
 */




























