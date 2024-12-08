package Exception_handling;

public class artmeticexp {

	public static void main(String[] args) {

		
		try {
					
		int a=100;
		int b=0;
		
		System.out.println(a/b);
		}	
		catch(ArithmeticException e)
		{
			
			System.out.println("zero is there hence change the value");
			int a=100;
			int b=10;
			
			System.out.println(a/b);			
			
		}
		
		}
		

}
