package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1;i<=5;i++) {
			int a = (int)(Math.random()*90+10);
			int b = (int)(Math.random()*90+10);
			
			System.out.print(a+" + "+b+" = ");
			int result = sc.nextInt();
			if(result == (a+b)) {
				System.out.print("참 잘했어요");
				System.out.println();
				count += 1;
				}
			else {
				System.out.print("틀렸다.");
				System.out.println();
				count -=0;
				}
		}System.out.println("당신은 총 "+count+"문제를 맞추어서 점수 "+count*20+"점 입니다.");
		
	}

}
