package for_;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		int dan = sc.nextInt();
		for(int i =1;i<10;i++) {
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
		System.out.println();
	}

}
