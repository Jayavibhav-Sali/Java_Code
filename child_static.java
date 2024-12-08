package practice_Inheritance;

class parent1{
	
	static void show()
	{
		System.out.println(" This is static parent method");
	}
	
}

public class child_static extends parent1 {
	
	static void show1()
	{
		System.out.println(" This is static child method");
	}
	

	public static void main(String[] args) {
		
		show1();
		show();
		

	}

}
