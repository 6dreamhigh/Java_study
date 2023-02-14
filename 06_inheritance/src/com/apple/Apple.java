package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨간 사과");
		//Zoo클래스의 tiger() 호출
		Zoo z = new Zoo();
		z.tiger();
//		z.elephant();
//		z.girafffe();
//		z.lion();   -error
	}

}
