package for_;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x값 입력: ");
		int x = sc.nextInt();
		System.out.print("y값 입력: ");
		int y = sc.nextInt();

		int result=1;
		for(int i=1;i<=y;i++) {
			result *=x;

		}System.out.println(x+"의 "+y+"승 = "+result);

	}

}
