package container;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		
		Set<String> set = map.keySet();
		System.out.println(set.toString());
		
		System.out.println(map.get("one"));

	}

}
