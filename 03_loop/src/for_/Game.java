package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("insert coin : ");
		int coin = sc.nextInt();
		for(;coin>300;coin-=300) {

				System.out.print("가위(3), 바위(2),보(1)중 하나를 입력>");
				int user = sc.nextInt();
				int com = (int)(Math.random()*3+1);
				int result = com -user;	

				switch(result) {
					case 0: System.out.println("You Draw!!");break;
					case 2: case -1:System.out.println("You Win!!");break;
					case -2: case 1:System.out.println("You Lose!!");break;	
					default:coin+=300; break;

			}
		}
				
	}

}


/*[문제] 가위, 바위, 보 게임
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 컴퓨터(com)는 1 ~ 3까지 난수로 나온다
- 1게임당 300원으로 한다.

[실행결과]
insert coin : 1000

가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user, 사용자)
컴퓨터 : 바위   나 : 보자기
You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!
*/
