package member;

import member.MemberService;

public class MemberMain {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		memberService.menu();
		System.out.println("프로그램 종료합니다.");
	}

}
