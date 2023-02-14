package sungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk {
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
//		
//		for(int i =0;i< arrayList.size();i++) {
//			System.out.println(arrayList.get(i).getNo()+"\t"
//								+arrayList.get(0).getName()+"\t"
//								+arrayList.get(0).getKor()+"\t"
//								+arrayList.get(0).getEng()+"\t"
//								+arrayList.get(0).getMath()+"\t"
//								+arrayList.get(0).getTot()+"\t"
//								+arrayList.get(0).getAvg()+"\t");//이 경우 주소만 꺼내옴
//			
//		}//list안의 값 꺼내오는 함수 :get
		//방법 2
//		for(SungJukDTO sungJukDTO : arrayList) {
//			System.out.println(sungJukDTO.getNo()+"\t"
//					+sungJukDTO.getName()+"\t"
//					+sungJukDTO.getKor()+"\t"
//					+sungJukDTO.getEng()+"\t"
//					+sungJukDTO.getMath()+"\t"
//					+sungJukDTO.getTot()+"\t"
//					+sungJukDTO.getAvg()+"\t");//이 경우 주소만 꺼내옴
//		}
		//방법 3
		for(SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO.toString());
			//주소가 나오게 함 클@16진수->DTO에서 toString함수 재정의 ->값 나오도록 함
		}
	}
	

}
