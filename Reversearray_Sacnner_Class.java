package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray_Sacnner_Class {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		
		int arr[]= new int[5];
		
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		
		int arr1[]= new int[arr.length];
		
	for(int i=0,j=arr.length-1;i<=arr.length-1;i++,j--) {
		
		arr1[j]=arr[i];
		
	}	System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.toString(arr1));
		
	}

}
