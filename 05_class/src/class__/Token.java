package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");
		//비어있는 값은 절대 자르지 않는다. ,,가 연속으로 있는 경우 무시
		System.out.println("토큰의 개수 = "+st.countTokens());//3
		
		while(st.hasMoreElements()) {//현재 위치에 토큰이 있는지 없는지 판단 .true/false반환
			System.out.println(st.nextToken());//토큰의 값을 꺼내주고 다음 토큰으로 이동
		}//비어있는 값은 꺼내지 않는다.
		System.out.println("------------------------");
		String[] ar = str.split(",");
		
		for(String data : ar) {//토큰과 다르게 비어있는 값도 꺼내게 된다.
			System.out.println(data);
		}
		
		
		

	}

}
/*
StringTokenizer클래스 /String클래스의 split()
1.문자열을 분리할 때 사용
*/
