package Numbers;

public class Prime_numbers_3 {

	public static void main(String[] args) {
		
		int x=10;
		//int cnt=0;
		
		
		for(int i=1;i<=x ; i++) {
			int cnt=0;
		
			for(int j=1; j<=x;j++) {
				
				if(i%j==0) {
					cnt=cnt+1;
				}				
			}
			if(cnt==2) {
				System.out.println(i);
			}
			else {
				cnt=0;
			}
			
		}
		
	}
	
}
