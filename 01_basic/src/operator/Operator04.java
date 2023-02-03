package operator;

public class Operator04 {

	public static void main(String[] args) {
		//논리연산자
		//&&연산자는 앞이 틀리면 뒤는 실행하지 않는다. / ||연산자도 마찬가지!!!
		//&연산자는 앞이 틀려도 뒤를 실행하여 &&보다 연산속도가 느리다.
		int num1 =0,num2 =0;
		boolean result;
		result = ((num1+=10) < 0 && (num2 +=10) > 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+ "num2 = "+num2);
		System.out.println();
		result = ((num1 += 10) > 0 || (num2 += 10) > 0);
		System.out.println("result = "+result);
		System.out.println("num1 = "+num1+ "num2 = "+num2);
	}

}
