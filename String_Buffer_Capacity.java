package String_Buffer;

public class String_Buffer_Capacity {

	public static void main(String[] args) {

		StringBuffer sb= new StringBuffer();
		System.out.println(sb.capacity()); // default capacity
		
		sb.append("1234567890,123456");
		System.out.println(sb.capacity()); // growth extends after exceeding i.e.(old capacity*2)+2;
		
	}

}
