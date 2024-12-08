package Numbers;

import java.util.Scanner;

public class Amstrongnumber_scannercalss {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter int value");
		
		int x=sc.nextInt();
		
		int temp=x;
	
		int r;
		
		int sum=0;
		
		
		while(x>0) {
			
		r=x%10;
		x=x/10;
		sum=sum+(r*r*r);
		
		}
		
		if(temp==sum) {
			System.out.println("Its amstrong");
		}else {
			System.out.println("Its not");
		}
	}

}
