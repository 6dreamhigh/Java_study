package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String [] ar = {"orange","apple","banana", "pear","peach","applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		Arrays.sort(ar);
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+" ");
		}
		System.out.println("\n");
		//---------------------------------------------
		
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("포르도",40);
		PersonDTO cc = new PersonDTO("라이언",35);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.print("정렬 전 = ");
		for(PersonDTO personDTO : list) {
			System.out.print(personDTO+" ");
		}
		System.out.println("\n");
		
		Collections.sort(list);
		System.out.println("나이로 오름차순");
		System.out.print("정렬 후 = ");
		for(PersonDTO personDTO : list) {
			System.out.print(personDTO+" ");
		}
		System.out.println("\n");
		
		
		
		//기본 정렬기준 외에 다른 기준으로 정렬할 시 Comperator사용
//		Comparator com = new Comperator(); // Comperator는 인터페이스 자체적인 객체 선언은 안됨
		System.out.println("이름으로 내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			public int compare(PersonDTO dto1, PersonDTO dto2) {
//				return dto1.getName().compareTo(dto2.getName());//- 오름차순
//				return dto2.getName().compareTo(dto1.getName());//- 내림차순
				return dto1.getName().compareTo(dto2.getName())*-1;//-1->1 ,1->-1,0->0 내림차순
			}
		};//키다리 아저씨 대동
		Collections.sort(list,com);
		System.out.print("정렬 후 = ");
		for(PersonDTO personDTO : list) {
			System.out.print(personDTO+" ");
		}
		System.out.println();
	}

}
















































