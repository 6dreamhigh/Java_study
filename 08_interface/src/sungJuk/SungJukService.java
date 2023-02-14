package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

import interface_.Div;
import interface_.Mul;
import interface_.Sub;
import interface_.Sum;

public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	// generic : arraylist의 담는 그릇 규정
	//- arraylist : 개수 제한이 없음
	public void menu() {
		Scanner sc = new Scanner(System.in);
		SungJuk sungJuk = null;
		int num;
		while(true) {
			System.out.println();
			System.out.println("***********");
			System.out.println("  1. 데이터 입력");
			System.out.println("  2. 데이터 출력");
			System.out.println("  3. 데이터 수정");
			System.out.println("  4. 데이터 삭제");
			System.out.println("  5. 데이터 정렬");
			System.out.println("  6. 프로그램 종료");
			System.out.println("***********");
			System.out.print("   번호 : ");
			num = sc.nextInt();
			
			if(num == 6)break;
			else if(num ==1)sungJuk = new SungJukInsert();					
			else if(num ==2)sungJuk= new SungJukList();
			else if(num ==3)sungJuk = new SungJukUpdate();
			else if(num ==4)sungJuk = new SungJukDelete();
			else if(num ==5)sungJuk = new SungJukSort();
			else {
				System.out.println("1~6번만 입력하세요");
				continue;
			}
			sungJuk.execute(arrayList);
		}
		
	}

}
