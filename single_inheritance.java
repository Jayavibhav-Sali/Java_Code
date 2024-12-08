package new_inheritance_practice;

class superclass {
	
	 static void show() {
		
		System.out.println("This is parent class");		
	}
}
public class single_inheritance extends superclass  {
	
	static void login() {
		System.out.println("This is child class method");
	}
	

	public static void main(String[] args) {
		
		show();
		login();
	}
	

}
