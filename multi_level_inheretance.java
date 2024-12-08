package new_inheritance_practice;

class gp {
	
	static void m1() {
		System.out.println("This is grantparent method");
	}
}

class p extends gp{
	
	static void m2() {
		System.out.println("This is Parent mathod");
	}
}

public class multi_level_inheretance extends p {

	static void m3() {
		System.out.println("This is child method");
	}
	
	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
}
