package Java_Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Collection_Queue_methods {

	public static void main(String[] args) {
		
		 LinkedList<Integer> q = new LinkedList<>();
		 	q.add(10);
	        q.add(20);
	        q.add(30);
	        q.add(40);
	        q.add(50);
	        System.out.println("Queue after adding elements: " + q);
	        
	     
	        q.add(2, 25);
	        System.out.println("Queue after adding 25 at index 2: " + q);
	       
	        List<Integer> newElements = Arrays.asList(60, 70);
	        
	        q.addAll(newElements);
	        System.out.println("Queue after adding collection: " + q);
	         
	        System.out.println("Size of queue: " + q.size());
	        
	     
	        q.remove();  
	        System.out.println("Queue after remove(): " + q);
	        
	        q.remove(2); 
	        System.out.println("Queue after remove(2): " + q);
	        
	        q.remove((Integer) 30); // Removes first occurrence of 30
	        System.out.println("Queue after remove(30): " + q);
	        
	        System.out.println("Element at index 3: " + q.get(3));
	        
	        q.set(1, 100);
	        System.out.println("Queue after setting index 1 to 100: " + q);
	        
	        System.out.println("Index of 50: " + q.indexOf(50));
	        System.out.println("Last index of 50: " + q.lastIndexOf(50));
	        
	        System.out.println("Queue equals itself: " + q.equals(q));
	        
	        System.out.println("HashCode of queue: " + q.hashCode());
	        
	        System.out.println("Is queue empty? " + q.isEmpty());
	        
	        System.out.println("Queue contains 40? " + q.contains(40));
	        
	        System.out.println("Queue contains all newElements? " + q.containsAll(newElements));
	        
	        q.sort(Comparator.naturalOrder());
	        System.out.println("Queue after sorting: " + q);
	        
	        q.offer(110);
	        q.add(120);
	        System.out.println("Queue after offer(110) and add(120): " + q);
	        
	        System.out.println("poll(): " + q.poll());
	        System.out.println("element(): " + q.element());
	        System.out.println("peek(): " + q.peek());
	        
	        q.clear();
	        System.out.println("Queue after clear(): " + q);

	}

}
