package multi;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] name; //이름
		int[] subjectCnt; //과목 수
		String[][] subject; //과목 이름
		int[][] jumsu; //점수
		double []avg; //평균
		//인원수
		System.out.print("인원수 : ");
		int cnt = sc.nextInt();
		
		//인원수 값으로 초기화
		name = new String[cnt];
		subjectCnt = new int[cnt];
		subject = new String[cnt][];
		jumsu = new int[cnt][];
		avg=new double[cnt];

		for(int i=0; i<cnt; i++) {
			System.out.print("이름 입력 : ");
			name[i] = sc.next();
			
			System.out.print("과목 수 입력 : ");
			subjectCnt[i] = sc.nextInt();
			subject[i] = new String[subjectCnt[i]];
			jumsu[i] = new int[subjectCnt[i]+1];
			
				for(int j=0; j<subjectCnt[i]; j++) {
					System.out.print("과목명 입력 : ");
					subject[i][j] = sc.next();
				}
				
				for(int j=0; j<subjectCnt[i]; j++) {
					System.out.print(subject[i][j]+"점수 입력 : ");
					jumsu[i][j] = sc.nextInt();
					jumsu[i][subjectCnt[i]] += jumsu[i][j];	//총점  
				}
				//평균 
				avg[i] = jumsu[i][subjectCnt[i]] / (double)subjectCnt[i];
				System.out.println();		
		}
		//출력
		for(int i=0; i<cnt; i++) {
			//상단
			System.out.print("이름\t");
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"\t");
			}
			System.out.print("총점\t");
			System.out.println("평균\t");
			
			//하단
			System.out.print(name[i]+ "\t");
			
			//과목별 점수, 총점 
			for (int j = 0; j < jumsu[i].length; j++) {
				System.out.print(jumsu[i][j] + "\t");
			}
			
			//평균 
			System.out.print(String.format("%5.2f", avg[i]));
			System.out.println("\n");
		}
	}
		
		
}

/*
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
평균은 소수이하 2째자리까지 출력
[실행결과]
인원수 : 2 (cnt)
이름입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------
이름     국어     영어   총점     평균
홍길동    95     100   xxx     xx.xx
이름      국어  영어   과학    총점      평균
이기자   95   100   90    xxx      xx.xx
*/