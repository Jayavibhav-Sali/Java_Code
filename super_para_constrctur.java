package new_inheritance_practice;

class gp11{
	
	
	gp11(int a){
		System.out.println("This is non para parent constructor");
	}
}

class gp21 extends gp11 {
	
	
	gp21(char cc){
		super(8);			
		{
			System.out.println("This is non para sub constructor");
		}
	}
}

class gp22 extends gp21{
	
	
	gp22(float m){
		super('j');
		System.out.println("oooo");
	}
	
}

class gp32 extends gp22{
	
	
	gp32(){
		super(7);
		System.out.println("oooofff");
	}
	
}
public class super_para_constrctur {
	public static void main(String[] args) {
		gp32 c= new gp32();
	}
}
