package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		//map은 제너릭 2개->key, value
//		Map <String , String> map = new Map(); 혼자는 안됨-> HashMap
		Map <String , String> map = new HashMap<String , String>();
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주");//value중복 허용
		map.put("book301", "피오나");
		map.put("book101", "엄지공주");//key 중복 허용

		System.out.println(map.get("book101"));//key중복 시 최신걸로 덮어써버림-엄지공주
		System.out.println(map.get("book102"));//백설공주
		System.out.println(map.get("book501"));//값이 없으면 null
	}

}
