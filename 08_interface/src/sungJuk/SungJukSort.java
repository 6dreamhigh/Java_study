package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk{
	public void menu(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		int no;
		while(true) {
     	   System.out.println();
     	   System.out.println("****************");
            System.out.println("  1. 총점으로 내림차순");
            System.out.println("  2. 이름으로 오름차순");
            System.out.println("  3. 이전 메뉴");
            System.out.println("****************");
            System.out.print("    번호 : ");
            no = sc.nextInt();
            if(no == 3) break; //3번이면 빠져나오기
            
            Comparator<SungJukDTO> com = null;
            if(no == 1) {
            	com = new Comparator<SungJukDTO>() {
            		//키다리 아저씨 역할
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//총점으로 내림차순
						if(s1.getTot() <s2.getTot())return 1;
						else if(s1.getTot() > s2.getTot())return -1;
						return 0;
					}
            		
            	};
            	
            }else if(no == 2) {
            	com = new Comparator<SungJukDTO>() {
            		//키다리 아저씨 역할
					@Override
					public int compare(SungJukDTO s1, SungJukDTO s2) {
						//이름으로 오름차순
						return s1.getName().compareTo(s2.getName());
					}
            		
            	};
            }
            else {
            	System.out.println("1~3번까지만 입력하세요");
            	continue;
            }
            Collections.sort(arrayList,com);//com을 기준으로 sort
            new SungJukList().execute(arrayList);
        }
	}
	
   @Override
   public void execute(ArrayList<SungJukDTO> arrayList) {
	   System.out.println();
	   this.menu(arrayList);
	 

      
   }
}


/*
7. SungJukSort.java

***********************
   1. 총점으로 내림차순
   2. 이름으로 오름차순
   3. 이전 메뉴
**********************
   번호 :
*/
