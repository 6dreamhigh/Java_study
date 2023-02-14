package inheritance;

enum Color{//상수들의 집합체
	RED, GREEN, BLUE 
}//public static final이 앞에 생략됨




//--------------
class Final {
	public final String FRUIT = "사과";
	public final String FRUIT2;
	public static final String ANIMAL = "기린";
	public static final String ANIMAL2;
//	public static final int RED = 0;
//	public static final int GREEN = 1;
//	public static final int BLUE = 2;

	
	
	//실행하자마자 메모리에 자동 생성됨 NEW 할 필요가 없다.
	//static은 생성자에서 초기화가 안된다. 
	static {
		System.out.println("static 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	public Final() {
		System.out.println("기본 생성자");
		FRUIT2 = "딸기";
	}//생성자 초기화
	
}
//--------------
public class FinalMain {

	public static void main(String[] args) {
		final int A = 10;//상수화 
//		A = 20;- error : final은 값을 변경할 수 없다.
		System.out.println("A = "+A);
		
		final int B;
		B = 30;
//		B = 40;
		System.out.println("B = "+B);
		Final f = new Final();
		System.out.println("FRUIT = "+f.FRUIT);
		System.out.println("FRUIT = "+f.FRUIT2);
		System.out.println("ANIMAL = "+Final.ANIMAL);
		System.out.println("ANIMAL2 = "+Final.ANIMAL2);
		//static은 final 소속만 알려주면 됨
		System.out.println("빨강 = "+ Color.RED);//컴퓨터는 1로 인식
		System.out.println("빨강 = "+Color.RED.ordinal());
		
		for(Color data : Color.values()) {
			System.out.println(data+"\t"+data.ordinal());
		}
	}

}
//final은 반드시 값을 초기화해야 한다.
//final 변수는 전부 대문자로 씀
//final 혼자만 씀 / 오버라이드는 모두 씀 final인 경우 오버라이드 하면 안된다.
//추상메소드는 반드시 오버라이드 해야 한다. final과 반대 개념 
//class 앞에 final 있으면 절대 상속 하면 안된다. 