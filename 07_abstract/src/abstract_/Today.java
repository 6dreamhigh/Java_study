package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //시스템의 시간과 날짜
		System.out.println("오늘 날짜 : "+date);
		//오늘 날짜 : Mon Feb 13 15:28:24 KST 2023
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : "+sdf.format(date));
		System.out.println();
		
		//입력 - 내 생일
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		//예외 처리 - 생각지도 않은 에러
		//1. 컴파일 -  예방용, 보험(try~catch, throws-자바가상 머신에게 던짐)
		//2.실행 - 개발자 실수(ArrayIndexOutOfBoundsException)
		Date birth = input.parse("19910716091415"); ////String ->Date형 변환
		
//		try {
//			Date birth = input.parse("1991071691415");
//		} catch (ParseException e) {
//			
//			e.printStackTrace();
//		} //String ->Date형 변환
		System.out.println("내 생일 : "+birth);//내 생일 : Tue Jul 16 09:14:15 KST 1991
		System.out.println("내 생일 : "+sdf.format(birth));
		//내 생일 : 1991년 07월 16일 화요일 09:14:15
		System.out.println();
		
//		Calendar cal = new Calendar();-error
		//sub class
		Calendar cal = new GregorianCalendar();
		
		//메소드 이용
		Calendar cal2 = Calendar.getInstance();
		//기준은 시스템 날짜와 시간
		int year = cal.get(cal.YEAR);
		//상수화 처리 전
//		int year = cal.get(1);
		int month = cal.get(cal.MONTH)+1;
		int day = cal.get(cal.DATE);
		int week = cal.get(cal.DAY_OF_WEEK);
		String dayofweek = null;
		switch(week) {
			case 1: dayofweek = "일";break;
			case 2: dayofweek = "월";break;
			case 3: dayofweek = "화";break;
			case 4: dayofweek = "수";break;
			case 5: dayofweek = "목";break;
			case 6: dayofweek = "금";break;
			case 7: dayofweek = "토";break;
		}
		int hour = cal.get(cal.HOUR_OF_DAY);
		int minute = cal.get(cal.MINUTE);
		int second = cal.get(cal.SECOND);
		System.out.println(year+"년 "+month+"월 "+day+"일 "+dayofweek+"요일 "+
						   hour+"시 "+minute+"분 "+second+"초 ");
		
		
	}

}
