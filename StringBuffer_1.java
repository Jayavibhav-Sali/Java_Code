package String_Buffer;

public class StringBuffer_1 {

	public static void main(String[] args) {

		
		StringBuffer sb= new StringBuffer("My name is Jay");
		sb.append(" Batch 47");		
		System.out.println(sb);
		
		sb.insert(0, "Hi, ");
		System.out.println(sb);
		
		sb.replace(2, 3, " Ekta,");
		System.out.println(sb);
		sb.delete(9, 11);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
