package constructor;



public class VarArgs {
	public VarArgs() {
		System.out.println("기본 생성자");
	}
	
	public int sum(int...ar) {//개수 상관없이 배열 생성->배열화
		int hap =0;
		for(int i =0;i<ar.length;i++) {
			hap+= ar[i];
		}
		return hap;
	}
//	int sum(int a,int b) {
//		return a+b;
//	}
//	int sum(int a,int b,int c) {
//		return a+b+c;
//	}
//	int sum(int a,int b,int c,int d) {
//		return a+b+c+d;
//	}
	public static void main(String[] args) {
		VarArgs va = new VarArgs();//생성자가 하나도 없으면 기본적으로 생성자 생성
		System.out.println("합 = "+va.sum(10,20));
		System.out.println("합 = "+va.sum(10,20,30));
		System.out.println("합 = "+va.sum(10,20,30,40));
	}
	

}
