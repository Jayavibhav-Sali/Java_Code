package Abstract;

interface one{	
	void login();	
}	
interface two{
	void show();	
}
public class Multiplelevel_InterFace implements one,two {	
	void dispaly() {		
		System.out.println("This is Child class");
	}

	public static void main(String[] args) {
		Multiplelevel_InterFace nn= new Multiplelevel_InterFace();	
		nn.login();
		nn.show();
		nn.dispaly();		
	}
	@Override
	public void show() {	
		System.out.println("This is interface 2");		
	}
	@Override
	public void login() {
		System.out.println("This is interface 1");
		
	}

}
