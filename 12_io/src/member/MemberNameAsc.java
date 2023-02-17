package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import member.MemberDTO;


public class MemberNameAsc implements Member{
	public void menu(List<MemberDTO> list) {
		//Comparator 인터페이스를 이용한 정렬 방법
		Comparator<MemberDTO> com = null;        
        	com = new Comparator<MemberDTO>() {
        		//키다리 아저씨 역할
				@Override
				public int compare(MemberDTO m1, MemberDTO m2) {
					//이름을 오름차순으로 정렬
					return m1.getName().compareTo(m2.getName());
				}
        		
        	};
        	Collections.sort(list,com);//com을 기준으로 sort
            new MemberPrint().execute(list);
	}

		
		

	@Override
	public void execute(List<MemberDTO> list) {
		Collections.sort(list);// Comparable을 이용한 정렬 방법
		System.out.println();
		this.menu(list);
		
	}
}
