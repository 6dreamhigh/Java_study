package abstract_;

import java.util.Calendar;
import java.util.Scanner;


class CalendarEx {
	private int year, month, week,lastDay;
	public CalendarEx() {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 : ");
		this.year = sc.nextInt();
		System.out.println("월 입력 : ");
		this.month = sc.nextInt();
	}
	public void calc() {
		Calendar cal = Calendar.getInstance();//메소드를 이용하여 클래스 생성
		//생성할 때 기준인 시스템 날짜, 시간을 내가 원하는 날짜로 변경
//		cal.set(Calendar.YEAR, this.year);//년도
//		cal.set(Calendar.MONTH, this.month-1);//월
//		cal.set(Calendar.DAY_OF_MONTH, 1);//일
		
		cal.set(year, month-1,1);//날짜 세팅
		//1일인 요일 구하기
		week = cal.get(Calendar.DAY_OF_WEEK);//일요일 -1 월 0 화1 
		//마지막 일 계산
		lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);//28,29,30,31
		
	}
	public void display() {
		System.out.println("일\t월\t화\t목\t금\t토");
		for(int i =1;i<week;i++) {
			System.out.print("\t");
		}
		for(int i =1; i<= lastDay;i++) {
			System.out.println(i+"\t");
			if(week%7 ==0)System.out.println();
			week++;
		}
	}
}


class CalendarMain {
	public static void main(String[] args) {
		CalendarEx c = new CalendarEx();
	
		c.calc();
		c.display();
	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 