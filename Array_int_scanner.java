package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_int_scanner {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int age[]= new int[4];
		
		for(int i=0;i<4;i++) {
			
			System.out.println("Please eneter index value of "+i);
			age[i]=sc.nextInt();
		}System.out.println("Final values are below");
		System.out.println(Arrays.toString(age));	
	}

}
