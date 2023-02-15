package nested;

public class Outer {
	private String name;
	
	public void output() {
		Inner in = new Inner();
//		System.out.println("이름 = "+this.name +"\t나이 = "+age);// 밖에서는 안의 것이 접근이 안됨
		System.out.println("이름 = "+name +"\t나이 = "+in.age);
		//바깥쪽 클래스는 안쪽의 클래스의 멤버에 접근 불가능 단 객체 선언 시 접근 가능
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = "+name+"\t"+ "나이 = "+age);
			//안쪽에 있는 클래스는 바깥쪽
//			System.out.println("이름 = "+name+"\t"+ "나이 = "+age);
			System.out.println("이름 = "+Outer.this.name+"\t"+ "나이 = "+this.age);
		}
	}
	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";//나의 영역 안이므로 private도 접근 가능
		System.out.println("이름 = "+ou.name);
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner(); //반드시 Outer안에 Inner 표시  
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();  
		in3.age = 30;
		in3.disp();
		System.out.println();
		
		Outer.Inner in4 = new Outer().new Inner();  
//		in4.name = "코난"; 
		//error -static영역에서는 this값이 없으며, inner클래스에서 outter클래스 접근 불가능
		in4.age = 35;
		in4.disp();



	}

}
// Outer .java
//----------
// Outer.class
// Inner.class
//xxxxxxxxxxxxxxxxxxxx - 위 형태는 중첩이 아닌 따로 있는 경우 -> 아래 형태가 맞음
//Outer$Inner.class

/* 
class 클 1{
	static class 클2{}// static 클래스

	class 클2{}// 내부 클래스 -멤버 내부 클래스
	메소드 () {
		class 클3 {} // 내부 클래스 - 로컬 내부 클래스
	{} // 내부 클래스 - 익명 내부 클래스 - **안드로이드에서 많이 쓰임
	
	
}//클1 - 중첩클래스 


상속 -is a
중첩클래스 - 클래스를 가지고 있다. -has a 
- 밖의 클래스가 안의 클래스를 접근 할려면
new로 객체 생성하면 접근할 수 있다. 
내 클래스 안에 클래스 있는 형태가 중첩 클래스 - 필드를 통해 접근 가능(setter,getter사용 안해도 됨)

*/

