package Date;

import java.util.Date;

public class new_Date_check {

	public static void main(String[] args) {

		
		Date currenttime= new Date();
		
		System.out.println(currenttime.getTime()); //eposh
		
		Date current= new Date(currenttime.getTime());
		System.out.println(current + "<-----------------Current Date and time");
		
		Date futuredate= new Date(currenttime.getTime()+(1000*60*60*24*1));
		System.out.println(futuredate + "<-----------------Future Date and time");
		
		Date pastdate= new Date(current.getTime()-(1000*60*60*24*1));
		System.out.println( pastdate +"<-----------------Past Date and time");
		
	}

}
