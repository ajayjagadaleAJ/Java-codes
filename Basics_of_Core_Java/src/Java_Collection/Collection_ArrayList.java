package Java_Collection;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;

public class Collection_ArrayList {

	public static void main(String[] args) {


		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("1");
		a1.add("feb");
		a1.add("2025");
		a1.add("!! Om");
		a1.add("Gan");
		a1.add("Ganpata ye");
		a1.add("Namon");
		a1.add("Maha !!");

		System.out.println("ArrayList string collection:" + a1);
		
		
		ArrayList a2 = new ArrayList<>();
		a2.add("om");
		a2.add('G');
		a2.add(101);
		a2.add(1.1);
		a2.add("true");
		
		System.out.println("ArrayList Collection:" + a2);
		
		
		ArrayList<Integer> a3 = new ArrayList<>();
		a3.add(19);
		a3.add(10);
		a3.add(11);
		a3.add(31);
		a3.add(12);
		a3.add(13);
		
		
//		Iterator itr = a3.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(a3);
//		}
		
		for(Integer a :a3)
		{
			System.out.println(a3);
		}

		
	}

}

