package class__;
import static java.lang.String.format;
//import static java.lang.Math.random;
//import static java.lang.Math.pow;
//import static : 간단하게 static 상수 또는 메소드를 호출할 때 사용
import static java.lang.Math.*; //wild card(* -모든 것)
import static java.lang.System.out;
public class ImportStatic {

	
	public static void main(String[] args) {
		out.println(random());//random을 많이 사용하는 경우 사용
		out.println(pow(2, 5));//2의 5승
		out.println(String.format("%.2f", 45.5678));
	}

}
