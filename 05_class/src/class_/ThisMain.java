package class_;
class This{
	private int b;
	private static int c;
	
	// setter:동전 투입구/getter:동전 배출구 만들기
	//함수는 무조건 public 선언
	public void setB(int b){//받기만 해서 반환값 없음 b는 지역변수=>인수(argument), 매개변수(parameter)//MAIN에서 데이터를 주면 private b에 보냄
		System.out.println("this = "+this);
		this.b = b;
	}
	public void setC(int c) {
		this.c =c;
	}
	
	public int getB(){
		return b;
	}	
	public int getC() {
		return c;
	}
}



public class ThisMain {
	private int a;//필드
	//private은 내 클래스 안에서는 접근이 가능하다.
	public static void main(String[] args) {
		ThisMain  tm = new ThisMain();
		tm.a = 10;
		System.out.println("a = "+tm.a);
		//b에 20을 넣어서 출력하시오
		This t = new This();
		System.out.println("객체 t = "+t);
		t.setB(20);//호출- 호출한 메소드는 반드시 돌아온다.
		//
		System.out.println("t.b = "+t.getB());
		t.setC(30);
		System.out.println("t.c = "+t.getC());
		System.out.println();
		This w = new This();
		System.out.println("객체 w = "+w);
		w.setB(40);
		w.setC(50);
		System.out.println("w.b = "+w.getB());
		System.out.println("w.b = "+w.getC());
	}

}
//모든 클래스는 반드시 생성해야 한다.
//자바는 실제 주소값이 아니라 참조 변수이다.실제 메모리 주소가 아니다. 웹에 최적화되어 있음
