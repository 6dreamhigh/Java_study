package array;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32,40,25,78,56};
		
		//출력
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); //4자리 출력
		}
		System.out.println();
		
		/*
		Sort(정렬)
		오름차순
		sort 메소드의 변수는 정수형 배열로 들어가고 반환값은 없다(static void)
		Arrays.sort(ar);
		System.out.println(ar[0]+","+ar[1]+","+ar[2]+","+ar[3]+","+ar[4]);
		*/
		
		//sort메소드를 쓰지말고 직접구성해보자!
		//오름차순(ASCENDING)
		int tmp;
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]>ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
		
		//내림차순(DESCENDING)
		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i]<ar[j]) {
					tmp=ar[i];
					ar[i]=ar[j];
					ar[j]=tmp;
					
				}
			}
		}
		System.out.println();
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d",ar[i])); 
		}
	}

}