package class__;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple";//literal 생성 (new가 아닌)->힙영역에 자리함
		String b = "apple";//a의 값과 같으므로 같은 곳을 가리킨다.
		// if(a==b) ->주소가 같은지를 물어본다.		
		if(a==b) System.out.println("a와 b의 참조값은 같다.");
		else System.out.println("a와 b의 참조값은 다르다.");
		if(a.equals(b))System.out.println("a와 b의 문자열은 같다.");
		else System.out.println("a와 b의 문자열은 다르다.");
		System.out.println();
		
		
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 같다.");
		else System.out.println("c와 d의 참조값은 다르다.");
		if(c.equals(d))System.out.println("c와 d의 문자열은 같다.");
		else System.out.println("c와 d의 문자열은 다르다.");
		System.out.println();
		//new를 시키면 메모리에 자리를 계속 만들어준다.
		
		
		String e = "오늘 날짜는 "+ 2023 + 2 + 10;//오늘 날짜는 2023210
		String f = "오늘 날짜는 "+ (2023 + 2 + 10);//오늘 날짜는 2035
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		/*
		한번 만들어진 문자열은 편집이 안된다. 메모리에 4번의 생성이 일어난다.
		"오늘 날짜는 "
		"오늘 날짜는 2023"
		오늘 날짜는 20232"
		오늘 날짜는 2023210"
		메모리에 매번 저장이 되고 최종적으로 오늘 날짜는 2023210"이 잡히며
		jvm이 이전 과정은 삭제를 하게되며, Garbage collector 에 보내 쌓이게 되면, 이때 컴퓨터는 멈춘다.
		***StringBuffer는 편집이 가능하다.***
		*/
		
		System.out.println("문자열 크기 = "+e.length());
		for(int i=0;i<e.length();i++) {
			System.out.println(i+" : "+e.charAt(i));
		}
		System.out.println("부분 문자열 추출 = "+e.substring(7));//2023210
		System.out.println("부분 문자열 추출 = "+e.substring(7,11));//2023
		
		System.out.println("대문자 변경 = "+"Hello".toUpperCase());
		System.out.println("대문자 변경 = "+"Hello".toLowerCase());
		System.out.println();
		
		System.out.println("문자열 검색 = "+e.indexOf("짜"));
		System.out.println("문자열 검색 = "+e.indexOf("날짜"));
		System.out.println("문자열 검색 = "+e.indexOf("개바부"));//없으면 -1 반환
		
		System.out.println("문자열 치환 = "+e.replace("날짜", "일자"));
		
	}

}


















