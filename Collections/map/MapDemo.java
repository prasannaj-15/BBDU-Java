package Collections.map;

import java.util.*;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		
		// map -> Key : values
		
		
		//Map<Integer,String> map = new HashMap<>();
		
		Map<Integer,String> map = new LinkedHashMap<>();
		
		
		map.put(10, "Aman");
		map.put(20, "kamal");
		map.put(30, "raj");
		map.put(40, "sahil");
		map.put(10, "Anuj");
		
		
		System.out.println(map);
		
		
		for(Map.Entry<Integer, String> m : map.entrySet()) {
		
			System.out.println(m.getKey() + " " + m.getValue());
			
		}
		
		

	}

}
