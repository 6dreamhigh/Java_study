package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		for(int i =0; i<arrayList.size();i++) {
			if(name ==arrayList.get(i).getName()) {
				//이름을 전부 arrayList에서 삭제한다.
				System.out.println("삭제하였습니다");
			}
			else if(name !=arrayList.get(i).getName()) {
				System.out.println("회원의 정보가 없습니다 ");
				}
			}
		
		}

	}

//6. SungJukDelete.java
//- 이름을 입력하여 없는 이름이면 "회원의 정보가 없습니다" 출력하시오
//- 똑같은 이름이 있으면 모두 삭제한다.
//
//삭제할 이름 입력 : 천사
//회원의 정보가 없습니다
//
//또는 
//
//삭제하였습니다.