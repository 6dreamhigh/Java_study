package class_;

class Person{
	//private : 해당 class 안에서만 접근
	private String name; //필드, 초기값 : null
	private int age; //필드, 초기값 : 0
	
	//method 구현
	public void setName(String n){
		name=n;
	}
	
	public void setAge(int a) {
		age=a;
	}
	
	public void setData(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setData() {
		
	}
	
	public String getName(){
		return name; //반환값
	}
	
	public int getAge(){
		return age; //반환값
	}
	
}
public class PersonMain {

	public static void main(String[] args) {
		
		Person a; //객체 선언(class형 변수)
		a = new Person(); //생성, 메모리의 heap영역에 생성(이름부여X, 주소O)
		
		System.out.println("객체 a = "+a);
		a.setName("권용준"); //호출 - 호출한 함수는 반드시 제자리로 돌아온다.
		a.setAge(30); //호출
		System.out.println("이름 = "+a.getName()+"  나이 = "+a.getAge());
		
		Person b = new Person();
		System.out.println("객체 b = "+b);
		
		b.setName("송섹근"); //호출 - 호출한 함수는 반드시 제자리로 돌아온다.
		b.setAge(25); //호출
		System.out.println("이름 = "+b.getName()+"  나이 = "+b.getAge());
		
		Person c = new Person();
		System.out.println("객체 c = "+c);
		c.setData("둘리", 100); //호출
		System.out.println("이름 = "+c.getName()+"  나이 = "+c.getAge());
		
		Person d = new Person();
		d.setData();
		System.out.println("이름 = "+d.getName()+"  나이 = "+d.getAge());
	}

}