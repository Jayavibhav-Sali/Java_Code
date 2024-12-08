package String;

public class str_pp {

	public static void main(String[] args) {

		String str= "121";
		
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			
			
			char cc=str.charAt(i);
			
			
			rev=rev+cc;
			
			
			
			
		}
		System.out.println(rev);
		if(str.equals(rev)) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("No");
		}
		
	}

}
