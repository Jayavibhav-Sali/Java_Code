package String;

public class reverse_string {

	public static void main(String[] args) {

		
		String name="Banglore";
		
		for(int i=name.length()-1; i<=name.length()-1;i--) {
			
			if(i==-1) {
				break;
			}
			System.out.print(name.charAt(i));					
		}	
	}

}
