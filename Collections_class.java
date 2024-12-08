package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_class {

	public static void main(String[] args) {

		List<Integer> l1= new ArrayList<Integer>();
		
		
		l1.add(45);
		l1.add(10);
		l1.add(1);
		l1.add(-1);
		l1.add(46);
		l1.add(0);
		
		Collections.sort(l1);
		System.out.println(l1);
		
	}

}
