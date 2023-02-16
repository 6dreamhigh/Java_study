package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SungJukSort implements SungJuk{
   @Override
   public void execute(ArrayList<SungJukDTO> arrayList) {
      Scanner sc = new Scanner(System.in);
      SungJukList sungjukList = new SungJukList();
      
       System.out.println("****************");
           System.out.println(" 1. 총점으로 내림차순");
           System.out.println(" 2. 이름으로 오름차순");
           System.out.println(" 3. 이전 메뉴");
           System.out.println("****************");
           System.out.print("번호 : ");
           int no = sc.nextInt();
           System.out.println("번호   이름   국어   영어   수학    총점   평균");

           if(no == 1) {//총점으로 내림차순
              Collections.sort(arrayList);
              sungjukList.execute(arrayList);
           }else if(no ==2) {//이름으로 오름차순
              Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
                public int compare(SungJukDTO dto1, SungJukDTO dto2) {
                   return dto1.getName().compareTo(dto2.getName());//- 오름차순
                
                }
             };//키다리 아저씨 대동
             Collections.sort(arrayList,com);
             sungjukList.execute(arrayList);
           }

      
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