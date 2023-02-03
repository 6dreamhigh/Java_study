package basic;

public class Sungjuk {

	public static void main(String[] args) {
		char name = 'L';
		int kor = 85;
		int eng = 78;
		int math = 100;
		int tot = kor + eng+ math;
		float avg = (float) ((tot) /3.0);
		System.out.println("\t***\t"+name+"성적표"+"\t***");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.printf("%d\t%d\t%d\t%d\t%.2f",kor,eng,math,tot,avg);
		

	}

}
/*
 *문제 : 성적 계산 
 *이름이 L이고 국어점수 85점, 영어점수 78점, 수학점수 100점일때 총점과 평균을 구하시오.
 *총점 = 국어점수 + 영어점수 + 수학점수 
 *평균 = 총점 / 과목수  
 *단, 평균은 소수점 이하 2째자리까지 출력
 *실행 결과
 *   *** L 성적표 ***
 국어    영어   수학  총점  평균
 85     78     100  XX   XX.XX
 * 
 * */
 