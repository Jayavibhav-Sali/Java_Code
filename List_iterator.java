package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List_iterator {

	public static void main(String[] args) {
	
		  List c2  = new ArrayList();
          
          c2.add("SuperMan");
          c2.add("Phantom");
          c2.add("Blank Panther");
          c2.add("AquaMan");
          c2.add("Batman");
          c2.add("Flash");
          
       Iterator il= c2.iterator();
       
       while(il.hasNext()) {
    	   
    	   System.out.println(il.next());
       }
          
       System.out.println("**********************************************"); 
       
       
                  
                 ListIterator ll = c2.listIterator() ; 
                 
                 while(ll.hasNext()) {
                	 
                	 System.out.println(ll.next());
                 }
                 
                 System.out.println("**********************************************"); 
                 
                 while(ll.hasPrevious()) {
                	 
                	 System.out.println(ll.previous());
                 }               
	}

}
