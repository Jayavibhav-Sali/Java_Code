package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_iterator {

	public static void main(String[] args) {

		            Collection cc = new ArrayList();
		            
		            cc.add("Yes");
		            cc.add("James Bond 007");
		            cc.add("Batman");
		            cc.add("Iron Man");
		            cc.add("Hulk");
		            cc.add(null);
		            cc.add(null);
		            cc.add(true);
		            
		       Iterator i1    = cc.iterator();
		       
				/*
				 * while(i1.hasNext()) {
				 * 
				 * System.out.println(i1.next());
				 * 
				 * }
				 */
		       
		       for(int i=0; i<=cc.size()-1; i++) {
		    	   
		    	   System.out.println(i1.next());
		       }
		       
	}
}
