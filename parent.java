package practice_Inheritance;

class grandparent{
	
	void show1() {
		System.out.println("This is Grand parent");
	}
}

public class parent extends grandparent
{
 
	void show() {
		System.out.println("This is Parent");
	}



	public static void main(String[] args) {
		parent p1= new parent();
		p1.show();
		p1.show1();
	}

}
