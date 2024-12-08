package Array;

import java.util.Arrays;

public class reverse_array {

	public static void main(String[] args) {

		int inputarr[]= {1,2,3,4,5};
		int outputarr[] = new int[inputarr.length];
		System.out.println("Input array");
		System.out.println(Arrays.toString(inputarr));
		
		for(int i=0,j=inputarr.length-1;i<=inputarr.length-1;i++,j--) {
						
				outputarr[j]=inputarr[i];
							
		}System.out.println(Arrays.toString(outputarr));
		System.out.println("Reversed array");
		
	}

}
