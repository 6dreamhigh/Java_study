package constructor;

public class ConstructorMain {
	String  name;
	private int age;
	
	public ConstructorMain() {
		System.out.println("default 생성자");
	}
	public ConstructorMain(String name) {//이름이 같은 경우 생성자 Overload (쌍둥이)
		this();
		System.out.println("name 처리 생성자");
		this.name = name;
	}
	public ConstructorMain(int age) {//이름이 같은 경우 생성자 Overload (쌍둥이)
		this("코난");//오버로드된 다른 생성자를 호출할 수 있다.
		//생성자 호출은 생성자에서 반드시 첫번째 줄에 있어야 오류가 안 난다.
		System.out.println("age 처리 생성자");
		this.age = age;
		
	}
	//모든 함수는 제자리로 오므로 위와 같은 꼬리에 꼬리를 무는 형태는 수행시간이 오래 걸린다.
	//클래스안에 생성자가 하나도 없을경우 자동으로 기본 생성자가 생성되어 처리된다.
	//생성자끼리는 호출이 된다.
	public static void main(String[] args) {
		ConstructorMain  aa = new ConstructorMain();//생성자는 한번 밖에 호출안됨
		//void를 앞에 쓰면 위에서 호출이 되지 않는다. 
		System.out.println(aa.name+"\t"+aa.age);
		System.out.println();
		ConstructorMain bb = new ConstructorMain("홍길동");
		System.out.println(bb.name+"\t"+bb.age);
		System.out.println();
		ConstructorMain cc = new ConstructorMain(25);
		System.out.println(cc.name+"\t"+cc.age);
		System.out.println();
	}
	

}
/*
 *자바는 이미 클래스 변수 생성하면서 초기화되어 있음  
 * 생성자는 클래스명과 똑같음
  class Test{
  	private int a;
  	public Test(int a){
  		this.a =a;
  	}
  	public void setA(int a){
  		this.a =a;
  	}
  	main-----{
  		Test t = new Test();
  		t.setA(10);
  		t.TEST(10);// 강제 호출이 안됨 NEW할때 생성자를 딱 한번 불러옴 계속 값을 수시로 바꿀려면 Setter함수 사용 
  		Test t = new Test(10);//생성자를 불러와 가능 ->생성자는 값을 한번 정해서 생성할때 사용
		클래스 안에 현재 생성자가 없다면 자동으로 생성하게 된다.
		public Test() {} ->default 생성자 /생성자는 반환되는 것이 아님 void X
		만약 생성자 안에 VOID 를 써버리면 생성자가 아니라 일반함수로 전략한다. 따라서 이 경우는 꼭 호출해서 사용해야 된다.
		public void setA(int a){} ->결과형 / 반환되는 타입
  *
  *
  */
 