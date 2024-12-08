package String;

import java.util.Scanner;

public class String_Palindrome_ScaneerCalss {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String name=sc.next();
		String output="";
		int i;
		
		for( i=name.length()-1;i<=name.length()-1;i--) {
			
			if(i==-1) {
				break;
			}	
			char c2=name.charAt(i);
			System.out.print(c2);
			output=output+c2;			
		}
		System.out.println();
		if(output.equals(name))
		{
			System.out.println("String is Plaindrome");
		}
		else {
			System.out.println("String is not Plaindrome");
		}		
	}

}
