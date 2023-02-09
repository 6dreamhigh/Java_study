package array;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현금 입력 : ");
		int money=sc.nextInt();
		for(int a=1; a<=(money/1000); a++) {
		int[] lotto= new int[6];
		//랜덤번호 생성
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			//중복번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
				
			}
			
		}
		//SelectionSort
		//오름차순 정렬
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int tmp = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=tmp;
				}
			}
		}
		for(int data : lotto) {
			System.out.print(String.format("%5d", data));
		}
		System.out.println();
		
		if(a%5 == 0)System.out.println();
		}

	}
}

/*
[문제] 로또 - 자동
- 크기가 6개인 배열 생성
- 1 ~ 45 사이의 난수 발생
- 숫자는 오름차순하여 출력(Selection Sort)
- 출력시 자리수는 5자리로 지정
- 중복 숫자가 나오면 안된다
- 1000원당 1줄이 나온다
- 5줄마다 줄바꿈
[실행결과]
현금 입력 : 7000
 2 4 19 39 43 44
 9 15 17 21 30 37 
 8 10 14 36 39 40 
 1 9 20 22 27 35 
 1 9 14 28 39 43 
 
 13 16 17 20 26 29 
 3 5 15 19 23 29 
 */