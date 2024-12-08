package Numbers;

public class prime_numbers {
	
	static int x;
	static int cnt;

	public static void main(String[] args) {

		x=29;
		cnt=0;
		
		for(int i=1; i<=x; i++) {
			
			if(x%i==0) {
				cnt=cnt+1;
			}
			
		}		
		
		if(cnt<=2) {
			
			System.out.println("Its prime");
		}
		
		else {
			System.out.println("Its not prime");
		}	
	
	}
	
}