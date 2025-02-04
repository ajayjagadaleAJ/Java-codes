package Java_Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Collection_TreeSet_ {

	public static void main(String[] args) {


		 NavigableSet<String> ts = new TreeSet<>();
	        ts.add("Hey");
	        ts.add("How");
	        ts.add("Are");
	        ts.add("you");
	        ts.add("A");
	        ts.add("B");
	        ts.add("Z");
	        
	        System.out.println("Initial TreeSet: " + ts);
	       
	        ts.remove("B");
	        System.out.println("After removing element: " + ts);

	        ts.pollFirst();
	        System.out.println("After removing first: " + ts);
	       
	        ts.pollLast();
	        System.out.println("After removing last: " + ts);
	        
	        for (String value : ts)

	            // Printing the values inside object
	            System.out.print(value + ", ");

	        System.out.println();
	 
	}

}
