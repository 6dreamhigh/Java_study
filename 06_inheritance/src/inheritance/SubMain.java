package inheritance;

public class SubMain extends Super {
	private String name;//내 밑으로 자식에게는 물려주지 않는다는 의미
	private int age;
	
	SubMain(){
		System.out.println("SubMain의 기본 생성자");
	}
	SubMain(String name, int age, double weight, double height){
		this.name = name;
		this.age = age;
//		this.weight = weight;//참조값이 나자신이 된다.
		super.weight = weight;//부모의 참조값은 super가 가진다.
		this.height = height;
		//내 것과 부모것 모두 사용가능
	}
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
		//부모 메소드 disp()호출
//		this.disp();
		disp();
	}
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25,73.5,182.6);
		aa.disp();//부모의 메소드 호출
		System.out.println("------------------");
		aa.output();
		Super bb = new SubMain("코난", 13,53.5,156.6);
//		bb는 SubMain안에 있는 Super를 가리키며 참조 SubMain의 메소드 output()는 참조할 수 없다. 
//		bb.output();//output()을 불러올 수 없게 된다.
		
	}

}
/*
- 자자식클래스는 메모리에 생성시 <자식 클래스> +<부모 클래스>를 생성한다. 
- new 부모 (기본 생성자)->기본 생성자가 없을때는 오류가 생긴다. Super 클래스안에 생성자가 있어 자동으로 생성 X
*/