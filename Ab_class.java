package Abstract;

abstract class ClassParent{
	
	abstract void login();
	abstract void Signup();
	
	static void postlogin() {	
		System.out.println("You have logged in sucessfully");
	}	
	void logout() {		
		System.out.println("Please visit again");
	}	
}
public class Ab_class extends ClassParent {
	
	@Override
	 void login() {	
		System.out.println("Please enter user name and Password");		
	}	
	@Override	
	void Signup() {		
		System.out.println("Please sign up");
	}	
	public static void main(String[] args) {
			
		Ab_class pp= new Ab_class();
		
		pp.login();
		pp.Signup();
		postlogin();
		pp.logout();		
	}
}
