package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection_add {

	public static void main(String[] args) {

			
		           Collection c1  = new ArrayList();
		           
		           c1.add("Hector");
		           c1.add("James");
		           c1.add("Bruce Wayne");
		           c1.add(null);
		           c1.add(null);
		           c1.add("Melificient");
		           c1.add(45.9);
		           c1.add(true);
		           c1.add(1);
		           c1.add('J');
		           
		           
		          // System.out.println(c1);
		           
		         Collection c2  = new ArrayList();
		         
		        c2.addAll(c1);
		         
		        // System.out.println(c2);
		         
		       //  c2.clear();
		    //     System.out.println(c2);
		         
		      // System.out.println(c2.isEmpty());
		       
		      boolean bb= c2.contains("Tom");
		      //System.out.println(bb);
		      
		     boolean v1=  c2.containsAll(c1);
		  //   System.out.println(v1);
		     
		     
		     
		           
		
		
	}

}
