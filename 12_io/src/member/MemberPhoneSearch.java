package member;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import member.MemberDTO;

public class MemberPhoneSearch implements Member{
	@Override
	public void execute(List<MemberDTO> list) {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("검색할 번호 입력 : ");
	      String phone = sc.next();
	      int count =0;
	      Iterator <MemberDTO> it = list.iterator();
//	      while(it.hasNext()) {
//	    	  MemberDTO MemberDTO = it.next();
//	    	  if(MemberDTO.getPhone().equals(phone)) {
//	    		  System.out.print(MemberDTO.getName()+"\t"+MemberDTO.getAge()+"\t"+MemberDTO.getPhone()+"\t"+MemberDTO.getAddress());
//	    		  System.out.println();
//	    		  count++;
//	    	  }
//	      }
	      for(MemberDTO memberDTO : list) {
	    	  if(memberDTO.getPhone().equals(phone)) {
	    		  System.out.println("이름\t나이\t핸드폰\t\t주소");
	    		  System.out.println(memberDTO);
	    		  count = 1;
	    		  break;
	    	  }
	      }//for
	     if(count ==0)
	    	System.out.println("해당하는 번호가 없습니다.");
	    
	}
}
