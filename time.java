package Date;

import java.util.Date;

public class time {

	public static void main(String[] args) {

		
		Date eposh= new Date();
		
		Date currenttime= new Date(eposh.getTimezoneOffset());
		System.out.println(currenttime);
	}

}
