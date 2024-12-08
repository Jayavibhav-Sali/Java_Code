package Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Map_object {

	public static void main(String[] args) {

		   Map m1       = new HashMap();
		   
		   m1.put(1, 2);
		   m1.put("Rebel", "Prabhas");
		   m1.put(null, null);
		   
		   System.out.println(m1);
		   
		   Map m2       = new HashMap();
		m2.putAll(m1);
		//System.out.println(m2);
		
	}

}
