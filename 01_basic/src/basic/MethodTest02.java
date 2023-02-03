package basic;

import java.util.Arrays;
import java.util.Random;

public class MethodTest02 {

	public static void main(String[] args) {
		//난수 -컴퓨터가 불규칙적으로 발생하는 숫자
		// 특징 - 0 <= 난수 < 1
		double a = Math.random();
		System.out.println("난수 : "+a);
		
		Random r = new Random();
		double b = r.nextDouble();
		System.out.println("난수 = "+ b );
		
		int [] ar = new int[5]; //배열
		ar[0] = 25;
		ar[1] = 13;
		ar[2] = 45;
		ar[3] = 30;
		ar[4] = 15;
		
		for(int i =0; i<5;i++) {
			System.out.print(ar[i]+" ");
		}System.out.println();
		//정렬 오름 차순
		Arrays.sort(ar); //반환값이 void 
		
		for(int i =0; i<5;i++) {
			System.out.println(ar[i]);
		}
		
		
	}

}
