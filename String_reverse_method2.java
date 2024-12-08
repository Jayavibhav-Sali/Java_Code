package String;

public class String_reverse_method2 {

	public static void main(String[] args) {

		
		String name="Banglore";
		
		String output="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char cc=name.charAt(i);
			output=output+cc;
		}System.out.println(output);
		
	}

}
