package String;

public class string_replaceall {

	public static void main(String[] args) {

		String name="Manish Kumar Tiwari";
		
	
		//System.out.print(name.replace(name, "MKT"));
		
		
		/*
		 * if(name.contains(name)) {
		 * 
		 * System.out.println("M"); System.out.println("K"); System.out.println("T"); }
		 */
		
		
	String name2= name.replaceAll("[a-z]", "");
	String name3=name2.replaceAll(name2, "MKT");
	
	//System.out.println(name2); 
	
	//System.out.println(name3);
	
	//System.out.println();
	
	
	for(int i=0; i<=name3.length()-1;i++) {
		
		char cc=name3.charAt(i);
		System.out.println(cc);
		
	}	
	}

}
