package Java_Collection;

import java.util.LinkedHashMap;

public class Collection_LinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> map = new LinkedHashMap();
		map.put(null, null);
		map.put(10, "ram");
		map.put(11, "ganesh");
		map.put(11, "ajay");
		map.put(null, null);
		map.put(12, "ajay");
		
		
		System.out.println(map);
		

	}

}
