package operator;

import java.util.Scanner;

public class Operator01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요 > ");
		int score = sc.nextInt();
		
//		String result = score >=80 && score <=100 ? "합격":"불합격";
//		System.out.println(result);
		if((score>=80)  && (score<=100)) {
			System.out.print("합격\t");
			if((score>=90))
				System.out.println("A학점");
			else
				System.out.println("B학점");
		}
		else if((score <80) ||(score>=70)) {
			System.out.println("불합격");
		}
		else {
			System.out.println("탈락 / 잘못 입력");
		}

	}
}
//	}
//}
