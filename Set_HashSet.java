package Collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


////1. Indexing:No
////2. Asserstion order:No
////3. Hetrogeneous:yes
////4. null:1 null
////5.Dublicate null:no
////6 Dublicate values:No
////7. Sort:No
////8.Iterator:Yes
////9.ListIterator:No
////10: Enumaration:No

public class Set_HashSet {

	public static void main(String[] args) {

		
	Set st	=new HashSet();
	
	st.add("Pen");
	st.add("moon");
	st.add(1);
	st.add(true);
	st.add(null);
	st.add("tree");
	st.add("mobile");
	st.add("Pen");
	System.out.println(st);
	
		
	}

}
