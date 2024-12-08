package Numbers;

public class num2 {

	public static void main(String[] args) {

		
		int x=7;
		int res=0;
		
		
		for(int i=1; i<=x; i++) {
			
			
			if(x%i==0) {
				res=res+1;
			}
		
		}		
		if(res==2) {
			System.out.println("Its prime");
		}
		else {
			System.out.println("not prime");
		}
			
		}	

	}
