package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a의 값 :");
		int a = sc.nextInt();
		System.out.print("b의 값 :");
		int b = sc.nextInt();
		System.out.print("c의 값 :");
		int c = sc.nextInt();
		int first = 0;//가장 큰 값
		int second = 0;//두번째로 큰 값
		int third = 0;//가장 작은 값
		//순서대로 정렬
		if(a <b && a<c) {
			third = a;
			if( b<c) {second =b; first = c;}
			else {second = c; first = b;}
		}
		else if (b < a && b<c) {
			third = b;
			if( a<c) {second =a; first = c;}
			else {second = c; first = a;}
		}
		else  {
			third = c;
			if( b<a) {second =b; first = a;}
			else {second = a; first = b;}
			
		}
		System.out.println(third+" "+second+" "+first);
		
			
		
	}

}



/*
 * [문제] 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98
---------------------
a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75
 * 
 * 
 * 
 * */
