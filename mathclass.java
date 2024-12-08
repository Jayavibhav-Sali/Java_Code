package practice_Inheritance;

public class mathclass {
	
	//1. Math class comes under java lang package
	//2. If any any class comes under java lang then we should not import them.We can call them directly
	//3. Math class have all static methods hence we can call them with . i.e. for ex: math.add 

	public static void main(String[] args) throws InterruptedException {
		
		// popular methods for math class
		System.out.println(Math.addExact(2, 2));
		//Thread.sleep(6000);
		System.out.println(Math.addExact(44444444, 55555555));
        System.out.println(Math.subtractExact(50, 55));
        System.out.println(Math.subtractExact(33333, 0));
        System.out.println(Math.multiplyExact(33, 33));
        System.out.println(Math.multiplyExact(44, 11));
        System.out.println(Math.multiplyExact(44, 22));
        System.out.println(Math.max(44, 33));
        System.out.println(Math.abs(-88.99)); // math.abs = it will give +ve number output
        System.out.println(Math.abs(-56.66)); 
        System.out.println(Math.abs(-6));
        System.out.println(Math.min(56, 10));
       System.out.println(Math.random());//we should not pass the values 
       System.out.println(Math.PI);
	
}
}