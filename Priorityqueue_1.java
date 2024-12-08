package Collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueue_1 {

	public static void main(String[] args) {

		Queue pq= new PriorityQueue();
		
		pq.add(1);
		pq.add(3);
		pq.add(8);
		pq.add(99);
		pq.add(45);
		pq.add(99);
		System.out.println(pq);
		
		
		Queue pq1= new PriorityQueue();
		pq1.add("abc");
		pq1.add("ttt1");
		pq1.add("abc");
		pq1.add("nnn");
		pq1.add("money");
		System.out.println(pq1);
		
		Queue pq2= new PriorityQueue();
		pq2.add(true);
		pq2.add(false);
		pq2.add(true);
		pq2.add(true);
		pq2.add(true);
		System.out.println(pq2);
		
		
	}

}
