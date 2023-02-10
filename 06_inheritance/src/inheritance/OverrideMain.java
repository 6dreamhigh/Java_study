package inheritance;


class AA {
	public int a = 3;
	public void disp() {
		a+=5;
		System.out.println("AA: "+a +" ");
	}
}
class BB extends AA{
	public int a = 8;//필드는 오버라이드 개념이 없다.(오버로드도 메소드에만 개념이 존재한다.)
	public void disp() {//오버라이드
		this.a+=5;//8+5
		System.out.println("BB: "+a +" ");//BB: 13
		
	}
}
//---------------------
public class OverrideMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp();
		System.out.println("AA: "+aa.a +" ");//AA: 13 
		System.out.println();
		AA bb = new BB(); //부모 = 자식
		bb.disp();
		System.out.println("bb : "+bb.a);//bb : 3
		BB cc = (BB)bb;		
		cc.disp();
		System.out.println("cc : "+cc.a);//cc : 18
		System.out.println();
		
		AA dd = new AA();
		dd.disp();
	}

}
