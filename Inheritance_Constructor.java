package practice_Inheritance;

class parent11{
	
	void launch() {
		System.out.println("Launch the app");
	}
}

public class Inheritance_Constructor extends parent11 {
	
	void login() {
		
		System.out.println("Chrome login");
	}
	
	Inheritance_Constructor() {
		
		System.out.println("Constructor login");
		
	}	

	public static void main(String[] args) {
		//Inheritance_Constructor i= new Inheritance_Constructor();
		//i.launch();
		//i.login();
		
   
	}

}
