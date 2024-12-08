package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array_camparions_scanner {
	
	void agecomp() {
		
		int age[]=new int[3];
		int age1[]=new int[3];
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			
			System.out.println("Please eneter 1st array i.e. age index "+i);
			age[i]=sc.nextInt();
		}
		
		System.out.println("Final values if 1st array are below");
		System.out.println(Arrays.toString(age));
		
		
          for(int k=0;k<3;k++) {
			
			System.out.println("Please eneter 2nd array i.e. age index "+k);
			age1[k]=sc.nextInt();
		}	
          System.out.println("Final values if 2nd array are below");
  		System.out.println(Arrays.toString(age1));
  		
  		System.out.println("Final values if 1st array are below");
		System.out.println(Arrays.toString(age));
		System.out.println("Final values if 2nd array are below");
	  	System.out.println(Arrays.toString(age1));
	  	
	  	boolean bb=Arrays.equals(age, age1);
	  	
	  	if(bb==true) {
	  		System.out.println("Both are equal");
	  	}
	  	else {
	  		System.out.println("Both are not equal");
	  	}	
	}
	
	public static void main(String[] args) {
		
		Array_camparions_scanner comp= new Array_camparions_scanner();
		comp.agecomp();
		
	}
		

}
