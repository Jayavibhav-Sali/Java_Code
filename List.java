package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class List {

	public static void main(String[] args) {

		          Collection c2  = new ArrayList();
		          
		          c2.add("SuperMan");
		          c2.add("Phantom");
		          c2.add("Blank Panther");
		          c2.add("AquaMan");
		          c2.add("Batman");
		          c2.add("Flash");
		          c2.add(1);
		          c2.add(100.9999);
		          c2.add(true);
		          c2.add(null);
		          c2.add(null);
		          c2.add('J');
		
		          System.out.println(c2);
		          
		          Collection c3  = new ArrayList();
		          
		          c3.addAll(c2);
		          System.out.println(c3);
		          
		          c3.clear();
		          System.out.println(c3);
		        System.out.println(c2.contains(c3));
		     System.out.println(c2.containsAll(c3));
		     System.out.println(c2.isEmpty());
		     System.out.println(c2.equals("Batman"));
		     c2.remove("Flash");
		     System.out.println(c2);
		    int ss =c2.size();
		     System.out.println(ss);
		          
		          
	}

}
