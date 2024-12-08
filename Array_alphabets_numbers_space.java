package Array;

import java.util.Arrays;

public class Array_alphabets_numbers_space {

	public static void main(String[] args) {
		
		int alphabet=0;
		int number=0;
		int space=0;

		String name="kv no 222";
		char c1[]=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0; i<name.length();i++) {
			char c=name.charAt(i);
			if(Character.isAlphabetic(c)) {
				
				alphabet++;
			}
			
			if(Character.isDigit(c)) {
				number++;
			}
			
			if(Character.isWhitespace(c)) {
				space++;			
			}
			
		}System.out.println(alphabet);
		System.out.println(number);
		System.out.println(space);
	}

}
