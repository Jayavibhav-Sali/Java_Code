package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector_pp {

	public static void main(String[] args) {

		
		
		Vector vc= new Vector();
		
		vc.addElement(1);
		vc.addElement("nnn");
		vc.add(22);
		vc.addFirst("mmmmm");
		vc.addLast(false);
		
		System.out.println(vc);
		
		Enumeration ee=   vc.elements();
		
		while(ee.hasMoreElements()) {
			System.out.println(ee.nextElement());
		}
			
	}

}
