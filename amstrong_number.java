package Numbers;

import java.util.Arrays;

public class amstrong_number {

	public static void main(String[] args) {

		int x=153;
		int temp=x;
		
		int r;
		int sum=0;
		
		while(x>0) {	
		r=x%10;
		x=x/10;
		sum=sum+r*r*r;
		}	
		
		if(temp==sum) {
		System.out.println("Its Amstrong");
		
	}else {
		System.out.println("no");
	}
}
	
}