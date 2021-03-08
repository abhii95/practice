package inheritance;

public class Main {
	
	
	/*
	 * public Main() { System.out.println("Main constructor"); }
	 */
	

	public static void main(String[] args) {

		Parent prco = new Child();
		
	

		// Child class overrides only m1() and m2() methods of Parent class
		// In inheritance hireachy search for method starts from parent class
		//prco.m3();

		// Child class scope must be equal or wider than Parent class scope
		//prco.m2();

		// prco.m4(); // compilation error cannot call child specific method
		// To call child class method Explicitly cast the Object
		//((Child) prco).m4();

		// Static methods cannot be overridden but same static method same method
		// signature can be created
		// in child class.Call to static methods is compiler based and it calls methods
		// based on reference type
		// as static is nothing to with instance of object
		// This is call method hiding

		//prco.ms();

		// instance variables depend upon reference type
		//System.out.println(prco.vstr);

		// Interfaces and abstract classes cannot have instance variables

	}

	public void print(Parent p) {

		if (p instanceof Child) {

		}
	}

}
