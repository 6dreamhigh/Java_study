package abstract_;

import java.util.Calendar;


public class CalendarEx {
	public void display(int year, int month) {
		 System.out.printf("\t\t%d년 %d월\n",year, month);
	     System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
	     
	}
	public void calc(int year, int month) {
		 //추상클래스 메소드 이용 방식으로 객체 생성
	     Calendar cal = Calendar.getInstance();

	    
	     //시작 날짜 설정 
	     cal.set(year, month - 1, 1);
	     //자바는 월(Month)이 0부터 시작함

	     int start = cal.get(Calendar.DAY_OF_WEEK);
	     //시작 날짜 설정
	     for (int i = 1; i < start; i++) {
	       System.out.print("\t");
	     }//일요일은 1이므로 1부터 시작하여 시작 요일 이전을 빈 공간으로 처리 
	     
	     //getActualMaximum은 현재 월이 가질 수 있는 최댓값 
	     for (int i = 1; i <= cal.getActualMaximum(Calendar.DATE); i++) {
	       System.out.printf("%d\t", i);
	       if(start % 7 == 0) {
	         System.out.println();
	       }
	       start++;
	     }
	 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 