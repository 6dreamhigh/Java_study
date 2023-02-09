package operator;

import java.util.Scanner;

public class Dice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//12345
		int com1 = (int)(Math.random()*6 +1);
		int com2 = (int)(Math.random()*6 +1);
		System.out.println("주사위1 :\t"+com1+"\t"+"주사위2 :\t"+com2);
		int sum = com1 +com2 ;
//		int result ;
//		if(com1-com2 < 0) {
//			System.out.println("주사위2\t승");
//		}
//		else if (com1 - com2 > 0) {
//			System.out.println("주사위1\t승");
//		}
//		else
//			System.out.println("무승부");
//		System.out.println("-----------------------------");
//		
		int result = com1 -com2;
		
		System.out.println(result == 0 ? "무승부": result > 0 ? "주사위1\t승": "주사위2\t승" );
		System.out.println("-----------------------------");

	}
}
/*	난수 설명
		- 컴퓨터가 불규칙하게 발생하는 수
		- 0 <= 난수 < 1

		x ~ y 사이의 난수
		(int)(Math.random() * (y-x+1) + x)

		ex) 65 ~ 90 사이의 난수 => (int)(Math.random * 26 + 65)
		
		
 * [문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 승
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 승
-----------------------------
주사위1 : 3   주사위2 :3
무승부
*/
 