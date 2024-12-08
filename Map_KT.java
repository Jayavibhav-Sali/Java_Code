package Map_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_KT {

	public static void main(String[] args) {

		
		 Map<String,Integer> v1   = new HashMap<String,Integer>();
		 
		 v1.put("AKT", 28);
		 v1.put("hhh", 56);
		// System.out.println(v1);
		 
		 Map<String,Integer> v2   = new HashMap<String,Integer>();
		 v2.putAll(v1);
	    System.out.println(v2);
		 
	
	  v2.remove("hhh"); 
	  System.out.println(v2);
	  v2.remove("AKT", 28);
	  System.out.println(v2);
	  //v2.putIfAbsent("AKT", 28); 
	  System.out.println(v2);
	  v2.putIfAbsent("AKT", 28); 
	//  System.out.println(v2);
	 
	    
	    
	    for(Entry<String,Integer> s1:v1.entrySet()) {
	    //	System.out.println(s1);
	    }
	    
	  //  System.out.println("****************************");
		 
	    for(Integer ss:v1.values()) {
	  //  	System.out.println(ss);
	    }
	    
	 //   System.out.println("****************************");
	    
	    for(String s2:v1.keySet()) {
	    	
	    //	System.out.println(s2);
	    }
	    
	 //   System.out.println("****************************");
		
	}

}
