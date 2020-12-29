package inheritance;

public class Parent {

	String vstr = "parent";

	public Parent() {
		System.out.println("Parent constructor");
	}

	public void m1() {
		System.out.println("m1() in parent class");
	}

	void m2() {
		System.out.println("m2() in parent class");
	}

	public void m3() {
		System.out.println("m3() in parent class");
	}

	public void parentNonStaticMethod() {
		System.out.println("parentNonStaticMethod() in parent class");
	}

	public static void ms() {
		System.out.println("ms() in parent class");
	}

}
