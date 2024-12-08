package Numbers;

public class Number_prime2 {

	public static void main(String[] args) {

		int x=29;
		
		
		for(int i=2; i<x; i++) {
			
			if(x%i==0) {
				
				System.out.println("Not prime");
				break;
			}				
		}System.out.println("Prime");
		
	}

}
