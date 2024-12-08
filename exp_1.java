package Exception_handling;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class exp_1 {
		
public static void main(String[] args) {
	
	try {
		System.out.println("Please enter values");
		Scanner sc= new Scanner(System.in);		
		int a=sc.nextInt();
		int b= sc.nextInt();		
		int result=a/b;
		System.out.println(result);		
	}
	catch(InputMismatchException ii) {
		System.out.println("In-put mismatch please try again");		
		Scanner sc= new Scanner(System.in);		
		int a=sc.nextInt();
		int b= sc.nextInt();		
		int result=a/b;	
		System.out.println(result);
	}
	catch(ArithmeticException ae) {		
		System.out.println("Please enter once again");		
		Scanner sc= new Scanner(System.in);		
		int a=sc.nextInt();
		int b= sc.nextInt();	
		int result=a/b;
		System.out.println(result);	
	}	
}
}
