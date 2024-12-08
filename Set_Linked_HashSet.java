package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Linked_HashSet {

	public static void main(String[] args) {

	Set stt	=new LinkedHashSet();
	stt.add("apple");
	
	stt.add("tree");
	stt.add(1);
	stt.add(null);
	stt.add("moon");
	stt.add(null);
	stt.add(true);
	stt.add("apple");
	stt.add("tiger");
	stt.add(556.77);
	System.out.println(stt);
	System.out.println();
		
	}

}
////1. Indexing:yes
////2. Asserstion order:yes
////3. Hetrogeneous:yes
////4. null:1 null
////5.Dublicate null:no
////6 Dublicate values:No
////7. Sort:No
////8.Iterator:Yes
////9.ListIterator:No
////10: Enumaration:No