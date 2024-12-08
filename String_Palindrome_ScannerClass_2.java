package String;

import java.util.Scanner;

public class String_Palindrome_ScannerClass_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		String output="";
		int i;
		
		for(i=name.length()-1; i>=0; i--) {
			
			char c1=name.charAt(i);
			output=output+c1;
		}System.out.println(output);
		
		if(output.equals(name)) {
			System.out.println("Is Palidrome");
		}
		else {
			System.out.println("Not polidrome");
		}
		
	}

}
