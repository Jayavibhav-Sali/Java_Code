package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface2_String_double {

	public static void main(String[] args) {

	   Map<String,Double>  mp1   = new HashMap<String, Double>();
	   
	     mp1.put("Suresh",44000.77);
	     mp1.put("Bruce wayne", 75000.845);
	     mp1.put("Peter parker", (double) 10000);
	     mp1.put("Hector", 1888.888);
	     System.out.println(mp1);
	     
	     // 1. for each loop to get each object(key and value) i.e by entryset();
	     
	     
	     for(Entry<String,Double> et:mp1.entrySet()) {
	    	 
	    	 System.out.println(et);
	     }
	     
	   // 2. set iterator
	     
	     System.out.println("********************************");
	     
	          Set<Entry<String,Double>>   st          = mp1.entrySet();
	          
	                Iterator ii          =  st.iterator();
	                
	                while(ii.hasNext())
	                {
	                	System.out.println(ii.next());
	                }
	//   3. only keys: from keykeys()  
	     System.out.println("************************************");
	                for(String ss:mp1.keySet()) {
	                	System.out.println(ss);       	
	                }
	                
	  // 4. only values
	                System.out.println("*********************************");
	                for(Double dd:mp1.values()) {                	
	                	System.out.println(dd);                	
	                }		
	}

}
