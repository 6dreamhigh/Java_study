package class__;
//숙제 
import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String original = sc.next();
		
		System.out.print("현재 문자열 입력 : ");
		String now = sc.next();
		
		System.out.print("바꿀 문자열 입력 : ");
		String after = sc.next();
		
	
		if(original.length() <now.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환 할 수 없습니다.");
//			System.exit(0);//프로그램을 강제 종료
			return; //함수를 벗어나라
		}
		original = original.toLowerCase();
		now = now.toLowerCase();
		//대소문자 섞인 것을 다 소문자로 바꿈

//		int index = original.indexOf(now);//맨 처음에 만난 문자열의 위치만 알려줌
		//original.indexof(문자,문자열의 개수+위치) 찾고 더 이상 없으면 -1 반환
		int index = 0,count = 0;
		while((index = original.indexOf(now,index)) !=-1 ) {			
			count ++;
			index = index +now.length();
			
		}
		System.out.println(original.replace(now, after));
		System.out.println(count+"번 치환");
	}

}
/*
치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
*/