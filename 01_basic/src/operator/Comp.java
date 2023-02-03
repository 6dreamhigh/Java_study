package operator;

import java.util.Scanner;

public class Comp {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("알파벳을 입력하세요 >>");
//		char x = sc.next().charAt(0);
//		char ch = 'b';
		char ch ='e';
		if(ch>=65 && ch<=90)ch+=32;
		else if(ch>=97 && ch<=122)ch-=32;
		
		int result = ch >= 'A' && ch <= 'Z' ?(ch+32) :(ch-32);
		System.out.println(ch +" -> "+(char)result); 
		
	}

}
//대문자는 65 ~ 90, 소문자는 97 ~ 122
//
/*
[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B → b         e → E
*/
 