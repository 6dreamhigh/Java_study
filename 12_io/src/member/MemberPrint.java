package member;

import java.util.ArrayList;
import java.util.List;

import member.MemberDTO;

public class MemberPrint implements Member{
	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		System.out.println("이름\t나이\t핸드폰\t\t주소");
		for(MemberDTO memberDTO : list) {
			System.out.println(memberDTO.toString());
			//주소가 나오게 함 클@16진수->DTO에서 toString함수 재정의 ->값 나오도록 함
		}
	}
}
