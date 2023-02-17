package member;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberService {
//	private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();
	List<MemberDTO> list = new ArrayList<MemberDTO>();//인터페이스 List 부모 = 자식
	public void menu() {
		Scanner sc = new Scanner(System.in);
		Member member = null;
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
			System.out.println("  1. 등록");
			System.out.println("  2. 출력");
			System.out.println("  3. 핸드폰 검색");
			System.out.println("  4. 이름으로 오름차순");
			System.out.println("  5. 파일 저장");
			System.out.println("  6. 파일 읽기");
			System.out.println("  7. 끝");
			System.out.println("********************");
			System.out.print("    번호 : ");
			num = sc.nextInt();
			
			if(num == 7) {break;}
			else if(num == 1) {member = new MemberInsert();}
			else if(num == 2) {member = new MemberPrint();}
			else if(num == 3) {member = new MemberPhoneSearch();}
			else if(num == 4) {member = new MemberNameAsc();}
			else if(num == 5) {member = new MemberFileInput();}
			else if(num == 6) {member = new MemberFileOutput();}
			else {System.out.println("1~7번까지만 입력해라ㅡㅡ");
				  continue;}

			member.execute(list);
			
			
		}
	}
}
