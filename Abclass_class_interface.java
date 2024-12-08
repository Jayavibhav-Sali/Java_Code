package Abstract;

interface ola{
	void tripcnf(String cnf);
	void tripcode(int code);	
}
abstract class passangerdetails implements ola{
	abstract void passagngername(String name);	
}
public class Abclass_class_interface extends passangerdetails {	
	@Override
	public void tripcnf(String cnf) {	
		System.out.println("Trip Status is :  "+ cnf );		
	}
	@Override
	public void tripcode(int code) {	
		System.out.println("Your code is : "+ code );		
	}
	@Override
	void passagngername(String name) {
		System.out.println("Your name : "+ name);	
	}
	void droppoint(String location) {
	
		System.out.println("Your drop location : "+location );	
	}
	public static void main(String[] args) {
	
		Abclass_class_interface nn= new Abclass_class_interface();		
		nn.tripcnf("cnf");
		nn.tripcode(1234);
		nn.passagngername("Batman");
		nn.droppoint("MG Road");	
	}		
	}


