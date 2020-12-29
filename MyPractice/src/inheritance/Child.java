package inheritance;

public class Child extends Parent {

	String vstr = "child";

	public Child() {
		System.out.println("Child constructor");
	}

	@Override
	public void m1() {
		System.out.println("m1() in child class");
	}

	@Override
	public void m2() {
		System.out.println("m2() in child class");
	}

	/*
	 * public static void parentNonStaticMethod() {
	 * System.out.println("parentNonStaticMethod() in parent class"); }
	 */

	public void m4() {
		System.out.println("m4() in child class");
	}

	public static void ms() {
		System.out.println("ms() in child class");
	}
}
