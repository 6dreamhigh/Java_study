package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //키보드로부터 입력받는 클래스 생성
		System.out.print("돈 입력 : ");
		int money = sc.nextInt();
//		int money = 5378;
		int thousand = money/1000;
		int hundred = (money%1000)/100;
		int ten = (money%100)/10;
		int one = (money%10);
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("현금 : "+df.format(money)+"원");//3자리마다 쉼표
		System.out.println("천원 : "+thousand+"개");
		System.out.println("백원 : "+hundred+"개");
		System.out.println("십원 : "+ten+"개");
		System.out.println("일원 : "+one+"개");

		
	
	}

}



/*
 문제 )현금 5378원이 있습니다.
 천원 : 5장
 백원 : 3개
 십원 : 7개
 일원 : 8개 
*/
 