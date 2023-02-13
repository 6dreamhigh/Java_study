package inheritance;


class Test extends Object{
	
}

class Sample{
	@Override
	public String toString() {// 오버라이드에서는 부모보다 자식이 더 우선권을 가짐
		return getClass()+ "@개바부";//자식에게 없는 getClass()를 부모로부터 가져옴
	}
}
class Exam{
	private String name = "홍길동";
	private int age = 25;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"\t"+age;//Object의 메소드를 가져옴
	}
//	public boolean equals(Object ob) {
//		//문자열 비교
//	}
}

public class ObjectMain {

	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = "+t);//클래스명@16진수
		System.out.println("객체 t = "+t.toString());
		//toString() 현재 Test에 없는 메소드이므로 부모인 Object로 올라가 불러옴
		System.out.println("객체 t = "+t.hashCode());//참조값을 10진수로 나타냄
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = "+s.toString());
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 e = "+e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = "+aa);
		System.out.println("객체 aa = "+aa.toString());
		System.out.println("객체 aa = "+aa.hashCode());
		//자식 클래스 메소드에서의 hashCode()값은 믿으면 x 
		//-문자열은 무한대이기 때문에 10진수로는 다 표기 할 수 없다.
		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb ==cc : "+ (bb==cc));//주소 false
		System.out.println("bb.equals(cc) : "+ bb.equals(cc));
		//String일때만 문자열비교-> true		
		System.out.println();
		
		Object dd = new Object();
		Object ee = new Object();//Object클래스는 주소만 비교
		System.out.println("dd ==ee : "+ (dd==ee));//주소 false
		System.out.println("dd.equals(ee) : "+ dd.equals(ee));//주소 false		
		System.out.println();
		
		//부모 클래스가 자식 클래스를 참조하는 형태
		//ff가 부모클래스Object의 equals를 참조하지만 ***오버라이드 되면***
		//-*** 무조건 자식의  equals함수가 우선됨 ***
		Object ff = new String("apple"); //부모 = 자식
		Object gg = new String("apple");//Object클래스는 주소만 비교
		System.out.println("ff ==gg : "+ (ff==gg));//주소 false
		System.out.println("ff.equals(gg) : "+ ff.equals(gg));//문자열 true		
		System.out.println();
		
	}

}
