package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Alpha_number_spacefinding_scanner {
	
	static int cnt_alpha=0;
	static int cnt_num=0;
	static int cnt_space=0;
	static int cnt_special=0;

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);	
		System.out.println("Please enter the String ");
		String input=sc.nextLine();
		char c[]=input.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<input.length(); i++) {
			
			char c1=input.charAt(i);
			if(Character.isAlphabetic(c1)) {
				cnt_alpha++;				
			}else if(Character.isDigit(c1))	{
				cnt_num++;
			}else if(Character.isWhitespace(c1)) {
				cnt_space++;
			}else if(!(Character.isLetterOrDigit(c1))&&!(Character.isWhitespace(c1))) {
				cnt_special++;
			}
		}
		System.out.println("Alphabet count ---> "+cnt_alpha);
		System.out.println("Number count ---> "+cnt_num);
		System.out.println("Space count ---> "+cnt_space);
		System.out.println("Special Charecter count ---> "+cnt_special);
	}
}
