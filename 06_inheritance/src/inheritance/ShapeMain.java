package inheritance;

import java.util.Scanner;

	class Shape{
		protected double area;
		protected Scanner sc = new Scanner(System.in);
	
	public Shape() {
		System.out.println("ShapeTest 기본생성자");
	}
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
class Sam extends Shape{
	
	}
}



