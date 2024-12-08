package Map_Interface;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



// ***** points to remember******
// 1. Map is not child interface of collection. 
// 2. Map can have duplicate values but not duplicate keys i.e. Key must be Unique.
// 3. Object of map is in the form of Key and Value pair.
// 4. Map don't follow indexing
// 5.


public class Map_inteface_practice {

	public static void main(String[] args) {

		
		       Map<String, String> m1   = new HashMap<String, String>();
		       
		       m1.put("Batman", "Brucewayne"); // 1.put method
		       m1.put("Spiderman", "Peter parker");
		       m1.put("Ironman", "Tony stark");
		       m1.put("Spiderman", "Tom holland");
		       m1.put("tt:The value is duplicate", "Brucewayne");    
		       System.out.println(m1);
		
	          Map<String,String> m2	= new HashMap<String,String>();
	            
	          m2.putAll(m1); // 2. put all method
	     //     System.out.println(m2);
	      int ss=    m2.size(); // 3. size
	   //   System.out.println(ss);
	      
	//    System.out.println(m2.get("Batman")); // 4. get method
	    
	    for(String s: m1.keySet()) { // 5. get all keys
	    	
	   //	System.out.println(s);
	    }
	    
	   for (String s2:m1.values()) { // 6. get all values
		  // System.out.println(s2);
	   }
	  
	  for(Entry<String,String> et:m1.entrySet()) {	  
		//  System.out.println(et);		  
	  }
	      Set<Entry<String,String>> st   = m2.entrySet();
	                       Iterator ii     =  st.iterator();
	                       
	                       while(ii.hasNext()) {
	                    	 //  System.out.println(ii.next());
	                    	   
	                       }
	  
	}

}
