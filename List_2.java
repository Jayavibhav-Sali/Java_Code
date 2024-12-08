package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_2 {

	public static void main(String[] args) {

	List c2	= new ArrayList<String>();
	
	   c2.add("SuperMan");
       c2.add("Phantom");
       c2.add("Blank Panther");
       c2.add("AquaMan");
       c2.add("Batman");
       c2.add("Flash");
       
    //   System.out.println(c2);
	
		List<String> c3= new ArrayList<String>();
		
		 c3.addAll(c2);
         System.out.println(c3);
         
        // c3.clear();
     //    System.out.println(c3);
     //  System.out.println(c2.contains(c3));
   // System.out.println(c2.containsAll(c3));
   // System.out.println(c2.isEmpty());
   // System.out.println(c2.equals("Batman"));
 //   c2.remove("Flash");
  //  System.out.println(c2);
   int ss =c2.size();
 //   System.out.println(ss);
    
    Collections.sort(c2);
    System.out.println(c2);
    
    
    
	}
}
