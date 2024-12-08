package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_remove {

	public static void main(String[] args) {

		
 Map<String,Integer> v1   = new HashMap<String,Integer>();
		 
		 v1.put("AKT", 28);
		 v1.put("hhh", 56);
	//	 System.out.println(v1);
		 
		 Map<String,Integer> v2   = new HashMap<String,Integer>();
		 v2.putAll(v1);
	  //  System.out.println(v2);
	  //  v2.remove("hhh");
	    System.out.println(v2);
	    System.out.println("*****************");
	    v1.remove("AKT", 28);
	    //System.out.println(v1);
	    
	//System.out.println(  v1.get("hhh"));
	    
	//  System.out.println(v1.containsKey("hhh"));
	// System.out.println(v1.containsValue(444));
	
	    System.out.println(v1.isEmpty());
	    v2.clear();
	    System.out.println(v2);
	}

}
