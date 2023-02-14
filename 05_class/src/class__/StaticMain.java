package class__;


class StaticTest{
	private int a;//필드, 인스턴스 변수
	private static int b;//필드, 클래스 변수
	
	static {
		System.out.println("초기화 영역");
		b = 5;//static 공간에서는 this가 없음 
//		= StaticTest.b = 5;
	}
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a = 5;
	}
	public void calc() {
		a++;
		b++;
		
	}
	public void disp() {
		System.out.println("a = "+this.a+ " b = "+ StaticTest.b);
	}
	public static void output() {
		System.out.println("static method");
//		System.out.println("a = "+a+ " b = "+ b);
		//error -static 메소드 안에서는 static 변수만 가능하다.
		//this를 참조할 수 없다.
	}
}
public class StaticMain {
	private int a;//필드, 인스턴스 변수(반드시 new 해야 쓸수 있음)
	private static int b;//필드, 클래스 변수 -클래스에 속하여 바로 쓸 수 있는 변수
	//클래스 밑에 잡혀진 변수는 필드이며, 이미 초기화되어있는 상태
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		//static은 공유 변수로 모든 객체가 공유한다.
		StaticTest.output();//클래스명, 메소드()
		aa.output();//객체.메소드()
	}

}
