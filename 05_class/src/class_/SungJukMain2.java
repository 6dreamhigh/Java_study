package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
//		Sungjuk aa = new Sungjuk(); // 1:1 관계
//		Sungjuk bb = new Sungjuk();
//		Sungjuk cc = new Sungjuk();
		
		Sungjuk[] ar = new Sungjuk[3]; //객체 배열
		ar[0] = new Sungjuk(); //클래스 생성
		ar[0].setData("홍길동", 91, 95, 100);
		ar[0].calc();
		
		ar[1] = new Sungjuk(); //클래스 생성
		ar[1].setData("프로도", 100, 89, 75);
		ar[1].calc();
		
		ar[2] = new Sungjuk(); //클래스 생성
		ar[2].setData("조르디", 75, 80, 48);
		ar[2].calc();
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(ar[i].getName()+"\t"+
					ar[i].getKor()+"\t"+ar[i].getEng()+"\t"+
					ar[i].getMath()+"\t"+ar[i].getTot()+"\t"+
					ar[i].getAvg()+"\t"+ar[i].getGrade());
		}
		
//		int a =10;  //정수형 변수
//		int b =20;
//		int c =30;
		
//		int[] ar =new int[3]//정수형 배열
//		ar[0]=10;
//		ar[1]=20;
//		ar[2]=30;

	}

}
