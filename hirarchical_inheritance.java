package new_inheritance_practice;

class parnt{
	
	void m1() {
		System.out.println("This is parent class");
	}
}

class subclass1 extends parnt{
	
	void m2() {
		System.out.println("This is Sub class1");
	}
}

public class hirarchical_inheritance extends parnt {
	
	void m3() {
		System.out.println("This is sub class2");
	}

	public static void main(String[] args) {
		
		subclass1 c1= new subclass1();
		hirarchical_inheritance c2= new hirarchical_inheritance();
		
		c1.m1(); c1.m2();
		c2.m1(); c2.m3();
	}
}
