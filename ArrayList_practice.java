package Collection;

import java.util.ArrayList;

public class ArrayList_practice {

	public static void main(String[] args) {
      
		 ArrayList<Integer> al     = new ArrayList<Integer>();
		 
		 al.add(1);   // add()
		 al.add(2);
		 al.add(10);
		 al.add(78);
		 
			/*
			 * int cc= al.get(3); // get() System.out.println(cc); Object ob=al.get(1);
			 * System.out.println(ob);
			 * 
			 * al.remove(1); System.out.println(al); // remove()
			 */
		 ArrayList<Integer> a2     = new ArrayList<Integer>();
			
			  a2.addAll(al); // addall() System.out.println(a2);
			 
			  ArrayList a3    = new ArrayList();
		System.out.println(a2); 
		a3.add(22);
		a3.add(44);
		a3.add(1);
		System.out.println(a3);
		
		a3.removeAll(a2);
		System.out.println(a3);
		//a3.clear();
		System.out.println(a3);
	//System.out.println(a3.contains(1));// contains();
//	System.out.println(	a3.containsAll(a2)); // containsall();
		System.out.println(a3.getFirst());
		System.out.println(a3.get(1));
		a3.set(0, 45);
		System.out.println(a3);
		System.out.println(a3.indexOf(44));
		       
	}

}
