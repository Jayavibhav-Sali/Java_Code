package Array;

public class Array_givennumberispartofArray {

	public static void main(String[] args) {
		
		int age[]= new int[5];
		
		age[0]=55;
		age[1]=50;
		age[2]=65;
		age[3]=75;
		age[4]=85;
		
		
		int num=85;
			
		for(int i=0;i<=4;i++) {
					
			if(num==age[i]) {
				System.out.println("Given Number "+ num+ " is present at the index "+ i);
				
			}			
		}				
	}
}


