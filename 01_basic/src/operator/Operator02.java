package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		String result = num % 2 != 0 ? "홀수":"짝수";
		System.out.println(result);
		
		String result2 = num %2 ==0 && num %3 ==0 ? "공배수":"공배수 아니다.";
		System.out.println(result2);

	}

}
