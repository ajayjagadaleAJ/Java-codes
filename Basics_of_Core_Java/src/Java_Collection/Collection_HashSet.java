package Java_Collection;

import java.util.HashSet;

public class Collection_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> h1 = new HashSet();
		h1.add("Hello");
		h1.add("Dear");
		h1.add("Ganesh");
		
		for(String Obj :h1)
		{
			System.out.println(h1);
		}
		
		HashSet<Integer> i1 = new HashSet<>();
		i1.add(10);
		i1.add(11);
		i1.add(15);
		i1.add(23);
		i1.add(19);
		i1.add(21);
		
		for(Integer i : i1) {
			
			System.out.println(i1);
		}
		
		
		HashSet<Object> hs = new HashSet<>();
		hs.add(10);
		hs.add("Ram");
		hs.add('c');
		hs.add(null);
		hs.add(3.34);
		hs.add(23);
		
		for(Integer i : i1) {
			
			System.out.println(i1);
		}
		
	}

}
