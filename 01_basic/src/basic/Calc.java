package basic;

import java.text.DecimalFormat;

public class Calc {

	public static void main(String[] args) {
		int a = 320;
		int b = 258;
		int sum = (a+b);
		int sub = (a-b);
		int mul = (a*b);
		double div = ((double)a/b);
		System.out.println("320 + 258 = "+sum);
		System.out.println("320 - 258 = "+sub);
		System.out.println("320 * 258 = "+mul);
		System.out.printf("320 / 258 = %.2f\n",div);
	

		
	}

}
/*
 * 문제
 * 320,258을 변수에 저장하여 합(sum), 차(sub) 곱(mul),몫(div)을 구하시오.
 * 단 소수점 아래 둘째짜리 출력
 *실행결과
 *320 + 258 = xxx
 *320 - 258 = xxx
 *320 * 258 = xxx
 *320 / 258 = xxx
 * */
 