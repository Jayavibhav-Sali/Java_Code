package Map_Interface;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_practice {

	public static void main(String[] args) {

		
		Map<String,Integer> m1   = new HashMap<String,Integer>();
		
		m1.put("abc", 1);
		m1.put("bbc", 2);
		m1.put("ccb", 3);
		
		System.out.println(m1);
		
		for(String s1:m1.keySet()) {
			System.out.println(s1);
		}
		
		for(Integer ii:m1.values()) {
			
			System.out.println(ii);
		}
		
		for(Entry<String,Integer> s3:m1.entrySet()) {
			System.out.println(s3);
		}
		
		
	}

}
