package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashpMapEx {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		String[] names = {"홍길동", "김유신", "xx", "xx","감강찬"};
		int[] nums = {1234,4567,204,927,2345};
		
		for (int i = 0; i<names.length; i++) {
			map.put(names[i], nums[i]);
		}
		
		Set<String>keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + map.get(key));
		}
		
//		System.out.println("Iterator로 출력.");
//		Iterator it = keys.iterator();
//		while (it.hasNext()) {
//			String a = (String)it.next();
//			System.out.println(a+"=" +map.get(a));
//		}

		
		
	}

}
