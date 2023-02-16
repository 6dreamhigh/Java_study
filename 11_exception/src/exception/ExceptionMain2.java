package exception;

import java.util.Scanner;


public class ExceptionMain2 {
	private static int x;
	private static int y;

public static void input() {
	Scanner sc = new Scanner(System.in);
	System.out.print("x 입력 : ");
	x = sc.nextInt();
	System.out.print("y 입력 : ");
	y = sc.nextInt();
	
	
}

public static void output() {
	if(y >=0) {
		int mul =1;
		for(int i =1;i<=y;i++) {
			mul *=x;
		}
		
		System.out.println(x+"의 "+y+"승은 "+ mul);
	}else {
		//System.out.println("y는 0보다 크거나 같아야 한다.");
		//개발자가 강제로 Exception 발생
		//throws -에러를 잡는다는 의미 JVM에게 떠넘기는 것 : 백신
		//throw - 개발자가 강제로 Exception 발생 :바이러스
		try {
			throw new Exception("y는 0보다 크거나 같아야 한다.");
			//throw는 바이러스-문제를 터트리는 것
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
}

	public static void main(String[] args) {
		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();
		
		
		
	}


}

/*
[문제] 제곱 연산
- x의 y승을 처리 한다.

[실행결과]
x 입력 : 2
y 입력 : 10         input()
----------------------------------
2의 10승은 xxx        output()
*/