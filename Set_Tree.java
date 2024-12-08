package Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

//// 1. Indexing:No
//// 2. Asserstion order:No
//// 3. Hetrogeneous:No
//// 4. null:no
//// 5.Dublicate null:no
//// 6 Dublicate values:No
////7. Sort:No
//// 8.Iterator:Yes
//// 9.ListIterator:No
//// 10: Enumaration:No

public class Set_Tree {

	public static void main(String[] args) {
      
		
		Set ss= new TreeSet();
		
		ss.add("aaa");
	//	ss.add(1);
		ss.add("aaa");
	//	ss.add(null);
		ss.add("ttt");
		ss.add("tree");
		System.out.println(ss);
		
		
	Collection ss2	=new TreeSet();
	
	ss2.add("aa");
	ss2.add("moon");
	ss2.add("sun");
	ss2.add("dd");
	System.out.println(ss2);
	}

}
