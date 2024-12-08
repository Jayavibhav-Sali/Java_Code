package Numbers;

public class pnt_all_prime {

	public static void main(String[] args) {

		int x=10;
		
		
		for(int i=1; i<=x; i++) {
			int res=0;	
			
			for(int j=1; j<=i;j++) {
				
				if(i%j==0) {
					res=res+1;
				}
			}
			
			if(res==2) {
				System.out.println(i);
			
		}else {
			res=0;
		}
		
			
		}
		
		
		}
	}


