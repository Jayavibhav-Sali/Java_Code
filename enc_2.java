package Encapsulation;


class antk{
	
	private String name="Jai";
	
	String getName() {
		
		return name;
	}
	
	void setName(String Name) {
		
		this.name=Name;
	}
}
public class enc_2 extends antk {

	public static void main(String[] args) {

		enc_2 act= new enc_2();
		act.setName("Rebel");
		
		System.out.println(act.getName());	
		
	}

}
