package Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class classpp 
{
	public static void main(String[] args) 
	{
		List l1=			new ArrayList();
			l1.add(765);
			l1.add(-78);
		/*	l1.add(85);
			l1.add(0);
			l1.add("Moon");
			l1.add("Sun");*/
			l1.add(true);
			System.out.println(l1);
			
		Iterator i1=	l1.iterator();
		System.out.println("Using Iterator forward Iteration: ");
			while(i1.hasNext())
			{
				System.out.println(i1.next());
			}
			
				ListIterator i2=	l1.listIterator();
				System.out.println("Using ListIterator forward Iteration: ");
	
				while(i2.hasNext())
					{
						System.out.println(i2.next());
					}
				System.out.println("Using ListIterator backword Iteration: ");

					while(i2.hasPrevious())
					{
						System.out.println(i2.previous());
					}
			
		
		
	}
	

}
