package abstract_;

import java.util.Scanner;

	abstract class Shape{
		protected double area;
		protected Scanner sc = new Scanner(System.in);
	
	public Shape() {
		System.out.println("Shape 기본생성자");
	}
	public abstract void calcArea();
	public abstract void dispArea();
}
	class Sam extends Shape{
		protected int base, height;
	public Sam() {
		
		System.out.println("Sam 기본 생성자");
		System.out.print("밑변 : ");
		base = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
//	@어노테이션 을 걸어 오버라이드가 목적인 것을 알림 / 각 메소드마다 써야 한다. 
	@Override
	public void calcArea() {
		area = (base * height)/2;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+ area);
		System.out.println();

	}
	
}
	class Sa extends Shape{
		protected int width, height;
	
	public Sa() {
		System.out.println("Sa 기본 생성자");
		System.out.print("가로 : ");
		width = sc.nextInt();
		System.out.print("세로 : ");
		height = sc.nextInt();
		System.out.println();

	}
	@Override
	public void calcArea() {
		area = width * height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+ area);
		System.out.println();

	}
}
	class Sadari extends Shape{
		protected int top,bottom, height;
	
	public Sadari() {
		System.out.println("Sadari 기본 생성자");
		System.out.print("윗변 : ");
		top = sc.nextInt();
		System.out.print("아랫변 : ");
		bottom = sc.nextInt();
		System.out.print("높이 : ");
		height = sc.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top+bottom)*height /2;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+ area);
	}
}
	public  class ShapeMain {

		public static void main(String[] args) {

			Shape shape; //부모는 리모컨만 가능
			shape = new Sam();
			shape.calcArea();
			shape.dispArea();
			
			shape = new Sa();
			shape.calcArea();
			shape.dispArea();
			
			shape = new Sadari();
			shape.calcArea();
			shape.dispArea();
			

		}

	}

