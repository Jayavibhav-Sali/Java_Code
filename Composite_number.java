package Numbers;

public class Composite_number {

	public static void main(String[] args) {

		int x=29;
		int cnt=0;
		
		for(int i=1; i<=x;i++) {
			
			if(x%i==0) {
				cnt=cnt+1;
			}		
		}			
		if(cnt>2) {			
			System.out.println("It is a Composite number");
		}
		else {
			System.out.println("Its not Composite number");
		}		
	}
}
