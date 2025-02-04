package Java_Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Collection_HashMap {

	public static void main(String[] args) {
		
		HashMap h1 = new LinkedHashMap();
		h1.put(101, "HP");
		h1.put(101, "Lenovo");
		h1.put(103, "Mac");
		h1.put(102, "Acer");
		h1.put(null, "HP");
		h1.put(105, null);
		h1.put(null, null);
		
		System.out.println(h1);
		

	}

}
