package new_inheritance_practice;

class gp1{
	
	gp1(){
		System.out.println("This is non para parent constructor");
	}
}

class gp2 extends gp1 {
	
	gp2(){
		
		{
			System.out.println("This is non para sub constructor");
		}
	}
}


public class super_constructor {

	public static void main(String[] args) {
		gp2 c1= new gp2();
		
	}

}
