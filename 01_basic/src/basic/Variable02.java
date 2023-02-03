package basic;
class Test{
	int a = 10;
	static int b =20;
	static String str;//null로 초기화되어 있음
}
public class Variable02 {  //main을 갖고 있는 경우만 class앞에 public을 붙일 수 있음
	int a = 5;//필드, 초기화가 끝남
	double d; //필드
	static int c; //new가 필요없고 실행하자마자 메모리를 갖게 됨
	public static void main(String[] args) {
		int a = 7;//지역변수
		System.out.println("지역변수 a ="+ a);
		Variable02 v = new Variable02();//메모리 생성
		System.out.println("객체 = "+v); //객체 = basic.Variable02@515f550a
		System.out.println("필드 a = "+v.a); //필드 a = 5
		System.out.println("필드 b = "+v.d); //필드 b = 0.0
		System.out.println("필드 c = "+c);//필드 c = 0 ->new가 필요없음 (Variable02.)가 c앞에 생략되어 있음
		
		
		//Test class의 a값을 출력하시오.
//		Test t = new Test();
//		System.out.println("필드 a = "+t.a);
//		System.out.println(Test.a);
		System.out.println("필드 b = "+Test.b);//클래스 영역 밖인 경우 생략하고 그냥 b라고 하면 안됨
		System.out.println("필드 str = "+Test.str);//필드 str = null
	}

}
