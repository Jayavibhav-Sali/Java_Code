package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_String {

	public static void main(String[] args) {

		
		List<String> cc= new ArrayList<String>();
		cc.add("Yes");
        cc.add("James Bond 007");
        cc.add("Batman");
        cc.add("Iron Man");
        cc.add("Hulk");
        
        
        System.out.println(cc);
        
        Collections.sort(cc);
        System.out.println(cc);
		
		/// Note: Cant sort null;
		
	}

}
