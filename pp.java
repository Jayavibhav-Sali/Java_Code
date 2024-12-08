package Numbers;

public class pp {

	public static void main(String[] args) {

		int a=100;
		
		
		
		for(int i=1;i<=a;i++) {
			int temp=0;
			
			for(int j=1;j<=i;j++) {
				
				if(i%j==0) {
					temp=temp+1;
				}
				
			}
			if(temp==2) {
				System.out.println(i);
			}else {
				temp=0;
			}
			
}
	}
}