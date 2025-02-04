package Java_Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection_LinkedList {

	public static void main(String[] args) {


		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("Hey");
		ll.add("how");
		ll.add("are");
		ll.add("you !!");
		
		
	    System.out.println(ll);
		
		
		
		LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(10);
		l2.add(2);
		l2.add(33);
		l2.add(12);
		l2.add(15);
		
		for(int a:l2)
		{
			System.out.println(l2);
		}
		
		

	}

}
