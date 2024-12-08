package Encapsulation;

class android{
	
	private long mobilenumber=123456789;

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}	
}
public class encap_1 {
	

	public static void main(String[] args) {
		android aa= new android();
		aa.setMobilenumber(5656666);
		System.out.println(aa.getMobilenumber());
		
		
		
	}

}
