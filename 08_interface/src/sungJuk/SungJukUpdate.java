package sungJuk;
//숙제
/*
 5. SungJukUpdate.java
- 없는 번호가 입력되면 "잘못된 번호 입니다." 라고 출력한다.
- 있는 번호가 입력되면 번호에 해당하는 데이틀 출력 후 수정한다.
번호 입력 : 
잘못된 번호 입니다.

또는 

번호   이름   국어   영어   수학    총점   평균

수정 할 이름 입력 : 
수정 할 국어 입력 : 
수정 할 영어 입력 : 
수정 할 수학 입력 : 

수정하였습니다
 */
import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호 입력 : ");
		int no = sc.nextInt();
		//반복문을 통해 arrayList에 해당 번호에 대한 정보 불러오기
//		수업 풀이방식
//		int sw =0;
//		for (SungJukDTO sungJukDTO : arrayList) {
//			if(sungJukDTO.getNo() == no) {
//				sw = 1;
//				System.out.println(sungJukDTO);
//				System.out.print("수정 할 이름 입력 : ");
//				String name = sc.next();
//				System.out.print("수정 할 국어 입력 : ");
//				int kor = sc.nextInt();
//				System.out.print("수정 할 영어 입력 : ");
//				int eng = sc.nextInt();
//				System.out.print("수정 할 수학 입력 : ");
//				int math = sc.nextInt();
//				sungJukDTO.setName(name);
//				sungJukDTO.setKor(kor);
//				sungJukDTO.setEng(eng);
//				sungJukDTO.setMath(math);
//				
//				sungJukDTO.calc();
//				
//				System.out.println("수정하였습니다.");
//			}
//		}
//		if(sw == 0)System.out.println("없는 번호 입니다.");
		
		for(int i =0;i<arrayList.size();i++) {
			if(no ==arrayList.get(i).getNo()) {
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			
				System.out.println(arrayList.get(i).getNo()+"\t"
									+arrayList.get(i).getName()+"\t"
									+arrayList.get(i).getKor()+"\t"
									+arrayList.get(i).getEng()+"\t"
									+arrayList.get(i).getMath()+"\t"
									+arrayList.get(i).getTot()+"\t"
									+arrayList.get(i).getAvg());
				System.out.print("수정 할 이름 입력 : ");
				String name = sc.next();
				System.out.print("수정 할 국어 입력 : ");
				int kor = sc.nextInt();
				System.out.print("수정 할 영어 입력 : ");
				int eng = sc.nextInt();
				System.out.print("수정 할 수학 입력 : ");
				int math = sc.nextInt();
			
				arrayList.get(i).setName(name);
				arrayList.get(i).setKor(kor);
				arrayList.get(i).setEng(eng);
				arrayList.get(i).setMath(math);
				System.out.println("수정하였습니다.");
			}
			else {
				System.out.println("잘못된 번호 입니다.");
				continue;
			}
		
		}
	
	}
}

	
