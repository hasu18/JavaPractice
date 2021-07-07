package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] st = { "parth", "magnoes", "parth", "mangoes", "oranges", "guavava", "pineapple", "parrot" };

		Map<Object, Object> map = new HashMap<>();

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123456);
		list.add(555555);
		map.put("parth", list);
//		map.put("harsh", (ArrayList<Integer>) Arrays.asList(22222, 5555555));

		System.out.println(" map " + map);
//
//		
//		
//		System.out.println(" values of parth "+ map.get("parth"));
//		
//		map.put("parth", (ArrayList<Integer>) Arrays.asList(1111111, 666666666));
//		
//		System.out.println("After changing value values of parth "+ map.get("parth"));

		Map<String, Integer> map1 = new HashMap<>();

	}

}
