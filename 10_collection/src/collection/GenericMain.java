package collection;

class GenericTest<T> {
	private T a; //실행할때 타입을 고정시킴



	public void setA(T a) {
		this.a = a;
	}
	public T getA() {
		return a;
	}
}



public class GenericMain {
	
	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();//문자열만 들어감
		aa.setA("홍길동");
		System.out.println("이름 = "+aa.getA());
		GenericTest<Integer> bb = new GenericTest<Integer>();
		bb.setA(25);
		System.out.println("나이 = "+bb.getA());
	}

}
//Collection - 객체를 담아주는 저장 창고
//크기 조절 가능
//객체 타입에 상관없이 저장 가능