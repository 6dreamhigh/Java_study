package class__;

import java.util.Scanner;

public class Exam {

	
		private String name = null;
		private String dap = null;
		private char[] ox = null;
		private int score = 0;
		private final String JUNG = "11111"; //상수화
	
		//생성자
		public Exam(){
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 입력: ");
			this.name = sc.next();
			System.out.print("답 입력: ");
			this.dap = sc.next();
			
			ox = new char[5];
		}
		//문자열=>char의 배열
		public void compare() {
			for(int i =0; i< ox.length;i++) {
//			for(int i =0; i< JUNG.length();i++) {
				if(dap.charAt(i) == JUNG.charAt(i)) {
					ox[i] = '0';
					score +=20;
				}else
					ox[i] ='X';
			}
		}
		public String getName() {
			return name;
		}
		public char[] getOx() {
			return ox;
		}
		public int getScore() {
			return score;
		}
}

/*
 * 오버로드
 * -메소드 이름 같고
 * -인수형 틀리거나, 인수 개수 틀린 경우
 */