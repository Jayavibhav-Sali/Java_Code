package Collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Linked_List {

	public static void main(String[] args) {

		
		List ll=new LinkedList();
		ll.add("Ttt");
		ll.add("hhh");
		ll.add("yyy");
		ll.add("mmm");
		ll.add("jjjj");
		System.out.println(ll.get(3));
		
		
	//	System.out.println(ll);
		
		
		Collections.sort(ll);
		System.out.println(ll);
		
		
	}

}
