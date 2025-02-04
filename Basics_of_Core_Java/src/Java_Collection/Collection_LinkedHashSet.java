package Java_Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection_LinkedHashSet {

	public static void main(String[] args) {

		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(10);
		h1.add(100);
		h1.add(100);
		h1.add(null);
		h1.add(null);
		h1.add("ajay");
		h1.add('c');
		h1.add(20.23);
		h1.add(100);
		
		System.out.println(h1);
		
		LinkedHashSet<String> h3 = new LinkedHashSet<String>();
		h3.add("ajay");
		h3.add("sagar");
		h3.add("mahesh");
		h3.add("sahil");
		h3.add("ayush");
		h3.add("piyush");
		
		
		Iterator<String> i1 = h3.iterator();
		while(i1.hasNext())
		{
			
			System.out.println(h3);
		}
	}

}
