package Date;

import java.util.Date;

public class Date_Class {

	public static void main(String[] args) {
				
		Date dd= new Date();
		
		//System.out.println(dd.getTime());
		
		Date d1= new Date(dd.getTime());
		
		System.out.println(d1);
		
		String Dateandtime= d1.toString();
		
		String Date=Dateandtime.toUpperCase();
		System.out.println(Date); // Upper case method
		
	String Day=	Dateandtime.substring(0, 3);
	System.out.println(Day); /// substring(start and end)
	String Monthandyear=Dateandtime.substring(4, 10);
	System.out.println(Monthandyear);
	String year=Dateandtime.substring(24);
	System.out.println(year);
	String time= Dateandtime.substring(11, 19);
	System.out.println(time);
	
	String Currenttime=Day.concat(" ").concat(year).concat(" ").concat(time);
	System.out.println(Currenttime);
	Date d13= new Date(dd.getTime()+(1000*60*60*24*1));
	
	System.out.println(d13);
			
			
			
			
		
	}

}
