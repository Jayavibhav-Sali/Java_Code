package String;

public class String_Palindrome_2 {

	public static void main(String[] args) {

		String name="dad";
		String output="";
		
		for(int i=name.length()-1; i>=0; i--) {
			
			char c1=name.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		
		if(output.equals(name)) {
			
			System.out.println("String is Palidrome");
		}
		else {
			System.out.println("String is not Palidrome");
		}
	}

}
