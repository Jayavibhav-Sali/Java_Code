package String_Builder;

public class SB {

	public static void main(String[] args) {

		
		StringBuffer c= new StringBuffer("Hello");
		
		c.delete(0, 2);
		System.out.println(c);
	}

}
