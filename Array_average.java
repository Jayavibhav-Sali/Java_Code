package Array;

public class Array_average {

	public static void main(String[] args) {

		double input[]= {5,8,16,20,5};
		double output=0;
		double total=input.length;
		double avg=0;
				
		for(int i=0; i<=input.length-1;i++) {		
			output=output+input[i];
		
		}
		avg=output/total;
		System.out.println(avg);
		System.out.println(output);		
	}
}
