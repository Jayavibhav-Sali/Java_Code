package Collection;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_que {
	
	    // 1. Indexing: No
		// 2. Aserstion Order: No
		// 3. Dublication:Yes
		// 4. Takes null values:No
		// 5. Takes dublicate null Values:No
		// 6. Hetrogeneous: No
		// 7. Sort: No
		// 8. Iterator:Yes
		// 9. List Iterator: No
		// 10. Enumaration:No

	public static void main(String[] args) {

		PriorityQueue pq= new PriorityQueue();
		
		pq.add("abc");
		pq.add("ttt");
		pq.add("abc");
		pq.add("nnn");
		System.out.println(pq);
        
	}

}
