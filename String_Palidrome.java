package String;

public class String_Palidrome {

	public static void main(String[] args) {

		
		String name="Aleela";
		String name1="";
		String output="";
		boolean name2=true;	
		
		name1=name.toLowerCase();
		//System.out.println(name1);
		
		for(int i=name.length()-1;i>=0;i-- ) {
			
			char cc=name1.charAt(i);
			output=output+cc;
			
		}
		
		System.out.println(output);
		
		
		
		if(output.equals(name1)) {
			System.out.println("Given text is palindrome");
		}
		else {
			System.out.println("Given text is not palindrome");
		}
	}

}

