package Java_Collection;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collection_PriorityQueue {

	public static void main(String[] args) {


		Queue<String> pq = new PriorityQueue<>();
		
		pq.add("THIS");
		pq.add("IS");
		pq.add("THE");
		pq.add("PRIORITY");
		pq.add("QUEUE");
		
		
		System.out.println("Initial Queue : " + pq);

        pq.remove("THE");

        System.out.println("After Remove :" + pq);
        
        System.out.println("Top element of Queue:"+ pq.peek());  //Used to pick top element

        System.out.println("Poll Method :" + pq.poll());       //Used to remove pick element

        System.out.println("Final Queue :" + pq);
        
        Iterator itr = pq.iterator();
        
        while(itr.hasNext())
        {
        	System.out.println("Iterated Queue is:"+ itr.next() + " ");
        }
	}

}
