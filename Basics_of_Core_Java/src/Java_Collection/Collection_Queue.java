package Java_Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Collection_Queue {

	public static void main(String[] args) {


		Queue<String> q = new LinkedList();
		
		q.add("Apple");
		q.add("Banana");
		q.add("orange");
		q.add("mango");
		
		System.out.println("Queue is:" +q);
		
		String str = q.remove();
		
		System.out.println("Removed Queue Element is :"+ str);
		
		System.out.println("Updated Queue is:" +str);
		
		q.add("Kivi");
		
		String peeked = q.peek();
		System.out.println("Peaked Element:"+ peeked);
		
		System.out.println("Updated Queue is:" + q);
		
		

	}

}
