package Map_Interface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_interface3 {

	public static void main(String[] args) {

		  Map<String,Character> mp2           = new HashMap<String,Character>();
		  
		  mp2.put("ABC", 'M');
		  mp2.put("XYZ", 'F');
		  mp2.put("AKT", 'M');	 
		  
		  Map<String,Character> mp3 = new HashMap<String,Character>();	
		  
		  mp3.putAll(mp2);
		  System.out.println(mp3);
		  mp2.putIfAbsent("TT", 'F');
		  mp3.putIfAbsent("123", 'h');
		  mp2.putIfAbsent("123", 'h');
		  System.out.println(mp3);
		  
		mp3.remove("123"); // remove object key(that means both key and value pair will be removed)
		System.out.println(mp3);
		
		mp3.remove("XYZ", 'J'); //remove object key and value
		System.out.println(mp3);
		mp3.clear();
		System.out.println(mp3); // clear method
		
	//System.out.println(	mp2.equals(mp3));
		
		for(Entry<String,Character> et:mp2.entrySet()) {
			
			//System.out.println(et);
		}
		
		System.out.println("**********************************************");
		
		        Set<Entry<String,Character>>   st     = mp2.entrySet();
		             Iterator ii                         = st.iterator();
		             
		             while(ii.hasNext()) {
		            	 
		            	// System.out.println(ii.next());
		             }
		             //System.out.println(	mp2.equals(mp3));        
	}

}
