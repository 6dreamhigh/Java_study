package member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import member.MemberDTO;

public class MemberInsert implements Member {
//- 회원의 정보는 이름, 나이, 핸드폰, 주소로 한다.
	@Override
	public void execute(List<MemberDTO> list) {
		System.out.println();
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("핸드폰 입력 : ");
		String phone = sc.next();
		System.out.print("주소 입력 : ");
		String address = sc.next();
		
		MemberDTO memberDTO = new MemberDTO(name,age,phone,address);
		
		
		list.add(memberDTO);
		System.out.println("입력하였습니다");
	}

}
