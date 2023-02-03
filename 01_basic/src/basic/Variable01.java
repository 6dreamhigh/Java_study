package basic;//폴더명

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //클래스화(객체형)Integer
		System.out.println(Integer.MIN_VALUE);// Wrapper class(포장시킨)
		System.out.println(Long.MAX_VALUE+","+Long.MIN_VALUE);
		System.out.println();
		boolean a = 25 > 43;
		System.out.println("a = "+ a);
		
		char b;//2byte 공간 잡음
		b = 'A';
		System.out.println("b = "+b);
		char c = 65;
		System.out.println("c = "+c);
		byte d = 127;
		//byte d = 128; 에러
		System.out.println("d = "+d);
		int e = 65;
		System.out.println("e = "+e);
		int f = 'A';
		System.out.println("f = "+f);
		
		long g = 25L; //Long형 상수데이터
		System.out.println("g = "+g);
		
		float h = 43.8f; //43.8은 double형 상수
		float k = (float)43.8;//강제형변환
		
	}
	

}
