package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

   @Override
   public void execute(ArrayList<SungJukDTO> arrayList) {
	   Scanner sc = new Scanner(System.in);
	      System.out.print("삭제할 이름 입력 : ");
	      String name = sc.next();
	      int count =0;
	      Iterator <SungJukDTO> it = arrayList.iterator();
	      while(it.hasNext()) {
	    	  SungJukDTO sungJukDTO = it.next();
	    	  if(sungJukDTO.getName().equals(name)) {
	    		  it.remove();
	    		  count++;
	    	  }
	      }
	      if(count ==0 )
	    	  System.out.println("회원의 정보가 없습니다.");
	      else
	    	  System.out.println(count+"건을 삭제하였습니다.");
   }
}
//		java.util.ConcurrentModificationException 에러 발생
//		for(SungJukDTO sungJukDTO : arrayList) {
//		  if(sungJukDTO.getName().equals(name)) {
//			  arrayList.remove(sungJukDTO);
//			  count++;
//			  System.out.println(count+"건을 삭제하였습니다");
//		  }
//		  
//		}      
      

//      for(int i =0; i<arrayList.size();i++) {
//         if(name.equals(arrayList.get(i).getName())) {
//            //이름을 전부 arrayList에서 삭제한다.
//            arrayList.remove(i);
//            count++;
//            System.out.println(count+"건을 삭제하였습니다");
//         }
////       if(count==0)
//         else if(!name.equals(arrayList.get(i).getName())) {
//            System.out.println("회원의 정보가 없습니다 ");
//            }
//         }
      
   

//6. SungJukDelete.java
//- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
//- 똑같은 이름이 있으면 모두 삭제한다.
//
//삭제할 이름 입력 : 천사
//회원의 정보가 없습니다
//
//또는 
//
//삭제하였습니다.