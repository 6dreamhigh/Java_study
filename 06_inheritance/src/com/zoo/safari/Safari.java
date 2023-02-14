package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo {

	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.tiger();
		
		//패키지가 다르면 접근할 수 있는 지정자는 public밖에 안된다.
//		z.elephant();
//		z.giraffe();
//		z.lion();   -error
		
		System.out.println();
		//부모는 자식 클래스가 있는 것을 몰라 접근 X
//		protected 는 다른 패키지에서 자식 클래스 로 접근 가능 단 자식클래스로 생성해야 한다.
//		-부모 클래스로 생성하면 접근이 안된다.
		Safari s = new Safari();
		s.tiger();
		s.giraffe();

	}

}
