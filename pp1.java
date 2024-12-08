package Practice;

import java.util.Arrays;

public class pp1 {

	public static void main(String[] args) {

		//1.Reverse String Practice with new valriable--- Method 1
		//2. Reverse String Practice without new valriable-- Method 2
		
		String name="jaj";			
		String output="";
		int j;
		/*
		 * for(int i=name.length()-1; i>=0; i--) {
		 * 
		 * char cc=name.charAt(i); output=output+cc; }System.out.println(output);
		 */

		
		/*
		 * for(int i=name.length()-1; i<=name.length()-1;i--) {
		 * 
		 * if(i==-1) { break; }
		 * 
		 * System.out.print(name.charAt(i)); }
		 */
	   
	//3 . String is plaindrome or no.		
	/*
	 * for(int i=name.length()-1; i>=0; i--) {
	 * 
	 * char cc=name.charAt(i); output=output+cc; }System.out.println(name);
	 * System.out.println(output); if(name.equals(output)) {
	 * System.out.println("Is Plaindrome"); } else {
	 * System.out.println("Nope its not"); }
	 */
		
		
		
	
	  int input[]= {1,2,3,4,5}; 
	 int output1=0;	 
	 int avg[]=new int [input.length];
	 int cal;
	 
	 
	 
	 
		/*
		 * for(int i=0,j1=input.length-1;i<=input.length-1;i++,j1--) {
		 * output1[j1]=input[i]; }System.out.println(Arrays.toString(input));
		 */
	 
		
		/*
		 * for(int i=0; i<=input.length-1;i++) {
		 * 
		 * output1=output1+input[i];
		 * 
		 * } System.out.println(output1);
		 * 
		 */
		 double input1[]= {1,2,3,4,5};
		 double output2=0;
		 
		 double avg1=input1.length;
		 
		 for(int i=0; i<=input1.length-1; i++) {
			 
			 output2=output2+input1[i];
		 }System.out.println(output2);
		 
		 System.out.println(output2/avg1);
		
		
		
		
		
		
		
		
	}

}
