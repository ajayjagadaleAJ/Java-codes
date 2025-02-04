package Java_Collection;

import java.util.Hashtable;

public class Collection_HashTable {

	public static void main(String[] args) {


		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Ramesh");
		h1.put(2, "Suresh");
		h1.put(4, "Ram");
		h1.put(5, "Ganesh");
		h1.put(6, "Ganesh");
		h1.put(6, "Rakesh");
		h1.put(7, "samira");
		
		System.out.println(h1);
		
		

	}

}
