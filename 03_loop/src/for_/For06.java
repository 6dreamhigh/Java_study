package for_;

import java.util.Scanner;

public class For06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int i = sc.nextInt();
		int result =1;
		for(int x =1;x<=i;x++) {
			result *=x;
		}System.out.println(i+"! = "+result);

	}

}
/*
[문제] 팩토리얼을 구하시오 (for)
- 입력되는 숫자는 1 ~ 10 사이만 입력한다.

[실행결과]
숫자 입력 : 3
3! = 6 (1*2*3)
---------------------

숫자 입력 : 5
5! = 120 (1*2*3*4*5)
*/