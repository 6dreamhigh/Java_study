package operator;

public class Operator03 {

	public static void main(String[] args) {
		int a = 5;
		a = 2;
		a = 3;
		a += 2;
		a *= 3;
		a /= 5;
		a++;
		++a;
		a-=1;
		--a;
		a--;//독단적으로 있을땐 선행 /후행 따지지 않는다.
		int b = a++;
		System.out.println(a + "\t"+b);
		int c = ++a * b--;
		System.out.println(c);
		System.out.println("a = "+a+" b = "+b); //a = 3 b = 2

	}

}
