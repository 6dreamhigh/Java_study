package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		int days;
		Scanner sc = new Scanner(System.in);
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		switch(month){
		case 1:case 3:case 5: days = 31;break;//switch를 벗어나라
		case 2: days = 28;break;
		case 4:case 6: days = 30;break;	
		default:days =0;
		}
		System.out.println(month +"월은 "+days+"일 입니다.");
		
		}

	}

