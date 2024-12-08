package Numbers;

public class number_postive_negative_orzero {

	public static void main(String[] args) {

		int x=8;
		
		if(x<0) {
			System.out.println("Its negative");
		}
		
		else if(x>0) {
			System.out.println("Its postive");
		}
		
		else if(x==0) {
			System.out.println("Its zero");
		}
		else {
			System.out.println("Please enter valid numver");
		}
		
		int a=10;
		int b=20;
		//int c;
		
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a);
		System.out.println(b);
		/*
		 * c=a; a=b; b=c;
		 * 
		 * System.out.println(a); System.out.println(b);
		 * 
		 */
			
	}

}
