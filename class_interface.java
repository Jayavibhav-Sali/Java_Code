package Abstract;

interface Swiggy{
	
	void foodorder();
	void foodreturn();	
}
public class class_interface implements Swiggy{
		
	void popup(String details) {
		
		System.out.println("Thank you for choosing swiggy");
	}	
	public static void main(String[] args) {		
		class_interface od= new class_interface();
		
		od.popup("xyz");
		od.foodorder();
		od.foodreturn();
	}
	@Override
	public void foodorder() {		
		System.out.println("Food is ordered Sucesfully");
	}
	@Override
	public void foodreturn() {		
		System.out.println("Food Returned");
	}
}
