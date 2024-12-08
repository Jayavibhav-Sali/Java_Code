package practice_Inheritance;

public class Simple_Inheritance_Satic {
	
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public static class child extends Simple_Inheritance_Satic
	{
		
		static void sub(int a, int b)
		{
			System.out.println(a-b);
		}	
		
	}

	public static void main(String[] args) {
		
		child n1= new child();
		
		n1.add(6, 7);//parent
		n1.sub(7, 7);//child

		
		
	}

}

