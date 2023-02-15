package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이");
		list.add("사자");
		list.add("호랑이");//중복도 허용
//		list.add(25);
//		list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		//배열은 length / arraylist는 size
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		for(String l : list) {
			System.out.println(l);
		}

	}

}
