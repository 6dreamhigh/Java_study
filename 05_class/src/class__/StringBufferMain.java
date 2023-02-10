package class__;

import java.util.Scanner;

public class StringBufferMain {
	private int dan; //클래스 전체에서 사용가능
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = sc.nextInt();
	}
	public void output() {
		StringBuffer buffer = new StringBuffer();//append(),delete() ->string은 없음(편집x)
		//StringBuffer buffer = "";타입이 다르므로 불가능
		
		
		for(int i=1;i<=9;i++) {
			//System.out.println(dan+"*"+i +"="+dan*i );
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			System.out.println(buffer.toString());//StringBuffer ->String
//			buffer.delete(0,100);
			buffer.delete(0,buffer.length());
		}
	}

	public static void main(String[] args) {
		StringBufferMain sbm = new StringBufferMain();
		//클래스를 생성하고 생성자를 자동으로 만들고 호출됨
		sbm.input();
		sbm.output();
		
		
	}

}
//StringBuffer는 문자열 편집이 가능하다.
/*
[문제] 구구단

원하는 단을 입력 : 5      input()
------------------------------------
5*1=5                  output()
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
*/
