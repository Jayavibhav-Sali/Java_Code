package String;

import java.util.Scanner;

public class String_Reverse_ScannerClass {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Eneter text to be reversed: ");
		
		String name=sc.next();
		
		for(int i=name.length()-1; i<=name.length()-1;i--) {
			
			if(i==-1) {
				break;
			}	
			System.out.print(name.charAt(i));			
		}
	}
}
