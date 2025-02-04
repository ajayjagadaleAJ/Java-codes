package Java_Collection;

import java.util.Set;
import java.util.TreeSet;

public class Collection_TreeSet {

	public static void main(String[] args) {

		Set<String> ts = new TreeSet<>();
		ts.add("Ok");
        ts.add("Google");
        ts.add("whre are you!");
        
        System.out.println("Tree Set is: " + ts);

        String check = "Google";

      //Contains method
        System.out.println("Contains " + check + ": "
                           + ts.contains(check));

        //first element
        System.out.println("First Value: " + ((TreeSet<String>) ts).first());

        //last element
        System.out.println("Last Value: " + ((TreeSet<String>) ts).last());

        String val = "Geek";

        // greater and smaller values
        System.out.println("Higher: " + ((TreeSet<String>) ts).higher(val));
        System.out.println("Lower: " + ((TreeSet<String>) ts).lower(val));

	}

}
