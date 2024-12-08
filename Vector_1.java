package Collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_1 {
	
	private static final String Enumaration = null;

	// 1. Indexing: Yes
	// 2. Aserstion Order: Yes
	// 3. Dublication:yes
	// 4. Takes null values:yes
	// 5. Takes dublicate null Values:yes
	// 6. Hetrogeneous: Yes
	// 7. Sort: Yes
	// 8. Iterator:yes
	// 9. List Iterator: Yes
	// 10. Enumaration:Yes
	

	public static void main(String[] args) {

		       Vector vv= new Vector();
		       
		       vv.add("Aquaman");
		   //    vv.add(1);
		    //   vv.add(null);
		   //    vv.add(null);
		    //   vv.add(13.66);
		       vv.add("Batman");
		       vv.add("Rat");
		       vv.add("Bat");
		 //      vv.add(false);
		       
		       System.out.println(vv);
		       	
				/*
				 * Iterator tt = vv.iterator(); while(tt.hasNext()) {
				 * System.out.println(tt.next());
				 * 
				 * }
				 */
		   
				/*
				 * ListIterator it = vv.listIterator();
				 * 
				 * while(it.hasNext()) { System.out.println(it.next()); }
				 * 
				 * System.out.println("********************");
				 * 
				 * while(it.hasPrevious()) { System.out.println(it.previous()); }
				 */
		       
		       
				/*
				 * Enumeration e = vv.elements();
				 * 
				 * while(e.hasMoreElements()) { System.out.println(e.nextElement()); }
				 */
		       
		       
		       Collections.sort(vv);
		       System.out.println(vv);
		       
		       
		   }
		  			   
	}			 


