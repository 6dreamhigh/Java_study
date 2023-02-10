package inheritance;

public class ChildMain extends Super{
	private String name;
	private int age;
	ChildMain(){
		System.out.println("SubMain의 기본 생성자");
	}
	ChildMain(String name, int age, double weight, double height){
		super(weight,height);//부모 생성자 호출
		this.name = name;
		this.age = age;
//		this.weight = weight;//참조값이 나자신이 된다.
//		super.weight = weight;//부모의 참조값은 super가 가진다.
//		this.height = height;
		//내 것과 부모것 모두 사용가능
	}
	public void disp() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
//		this.disp();//disp()만 반복하여 메모리 다운됨
		super.disp();
	}
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25,73.5,182.6);
		aa.disp();
		System.out.println("------------------");
		
		Super bb = new ChildMain("코난", 13,53.5,156.6);
		bb.disp();
	}

}
/*- 10줄 자식은 부모 클래스의 생성자를 선택할 수 있다. 단, super()는 생성자의 첫줄에 써야 한다.
 * -Overload
 * 1. 하나의 클래스 안에서 움직인다.
 * 2. 메소드 이름이 똑같다.
 * 3. 인수 개수, 자료형이 틀린 경우이다.
 * 
 class AA{
 	public void sub(int a){}
 }
 class BB{
 	public void sub(int a){}
 	public void sub(int a,int b){}
 	public void sub(char a){}
 	}->오버로드는 클래스가 달라지면 의미가 없게 된다.반드시 하나의 클래스안의 같은 이름의 메소드가 오버로드
 * 
 * 
 * 더 중요!
 - Override :
 * 1.부모클래스와 자식 클래스가 다 똑같아야 한다.
 * 2. modifier(접근 제한자) public, protected, private 는 달라도 된다.
 * 단, 자식클래스는 modifier가 더 커야 한다.
 class AA{
 	protected void sub(int a){}
 	}
 	class BB extends AA{
 	   public void sub(int a,int b){}
 	   public void sub(int a){} //반드시 이름과 인자까지 다 똑같아야 한다.
 	   
 
 
 *  부모와 자식에게 똑같은 메소드가 존재함
 * 모든 우선권은 자식클래스(Subclass)가 갖는다. 이름이 똑같은 disp()인 경우
 *  자식 클래스의 disp()가 더 우선권을 가지게 되어 모두 출력하게 된다. 
 *  단, 부모는 자식 클래스의 메소드를 사용할 수 없게 된다. 
 *  부모 클래스 입장에서 자식 클래스의 코드는 보이지 않는다. 내 밑의 자식이 있단 사실을 알지 못한다.
 *  단, 추상클래스는 부모 클래스가 자식 클래스의 메소드를 사용할 수 있다.
 *  ->추상클래스는 부모 클래스가 자식 클래스를 제어할 때 사용한다.
   
 */
