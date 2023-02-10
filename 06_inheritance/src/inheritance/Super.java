package inheritance;

public class Super extends Object {// extends Object이 항상 생략됨 /상속받고 있었음
	protected double weight, height;
	
	Super(){
		System.out.println("Super의 기본 생성자");
	}
	Super(double weight,double height) {
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("몸무게 = "+weight);
		System.out.println("키 = "+height);
	}

	public static void main(String[] args) {
		

	}

}
/*
 상속은 클래스의 재구현
 class A {
 	protected int b;//자식에게는 물려줄 수 있다. 
 }//private은 나자신의 클래스 내에서만 가능하므로 B클래스에서 사용할 수 없다.
 class B{
 }
 - 상속받는 클래스는 상속해주는 클래스의 생성자와 private를 제외한 모든 것을 상속받는다.
 - super class: 상속해주는 부모 클래스
 - sub class :상속받는 자식 클래스
 - 내 위의 부모는 하나 : 단일 상속(is a관계)
 - c언어는 다중 상속이 가능 , 자바는 다중 상속이 불가능하다. 
 - 다중 상속의 개념을 쓰기 위해 interface가 등장하였다.
 - 상속이 아니라 상속 받은 것처럼 <  interface >
 - 상속은 한번은 가능하지만 interface는 여러번 가능하다.
 */
