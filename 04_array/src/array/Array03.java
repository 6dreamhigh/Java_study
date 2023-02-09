package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size;
		int[] ar;
		int sum=0;
		
		System.out.print("배열 크기 입력 : ");
		size = sc.nextInt();
		
		ar= new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("ar["+i+"] 입력 : ");
			ar[i] = sc.nextInt();
		}
		
		/*
		for(int i=0; i<=size-1; i++) {
			sum+=ar[i];
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("합 = "+sum);
		*/
		
		//최대값구하기.
		int max = ar[0]; //배열의 첫번째 데이터를 초기값으로 갖는다.
		for(int i=1; i<size; i++) {
			if(ar[i]>max) {
				max=ar[i];
			}
		}
		
		//최소값구하기
		int min = ar[0]; //배열의 첫번째 데이터를 초기값으로 갖는다.
		for(int i=1; i<size; i++) {
			if(ar[i]<min) {
				min=ar[i];
			}
		}
		
		for(int data : ar) {
			sum+=data;
			System.out.print(data+" ");
		}
		System.out.println();
		System.out.println("합 = "+sum);
		System.out.println("최대값 = "+max);
		System.out.println("최소값 = "+min);
	}

}
/*
[문제] 배열의 크기를 입력받아서 배열을 생성한다.
데이터를 출력하고 합, 최대값, 최소값을 구하시오.
[실행결과]
배열 크기 입력 : 3
ar[0] 입력 : 25
ar[1] 입력 : 13
ar[2] 입력 : 57
25 13 57
합 = xxx
최대값 = xx
최소값 = xx
*/
