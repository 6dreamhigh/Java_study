package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();//이름
		System.out.print("직급 입력 : ");
		String position = sc.next();//직급
		System.out.print("기본급 입력 : ");
		int base_salary = sc.nextInt();//기본급
		System.out.print("수당 입력 : ");
		int extra_pay = sc.nextInt();//수당
		
		int total = base_salary +extra_pay;//합계
		double rate;//비율
		if(total >= 5000000) rate = 0.03;
		else if(total >= 3000000)rate = 0.02;
		else rate =0.01;
		double tax = total * rate;//세금
		double monthly_pay = total -tax;//월급
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("***"+name+" "+position+"***");
		System.out.println("기본급 : "+df.format(base_salary)+"원");
		System.out.println("수당 : "+df.format(extra_pay)+"원");
		System.out.println("합계 : "+df.format(total)+"원");
		System.out.println("세금 : "+df.format(tax)+"원");
		System.out.println("월급 : "+df.format(monthly_pay)+"원");
	}

}

/*
 * [문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/
