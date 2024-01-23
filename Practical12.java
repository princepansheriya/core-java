package com.corejava.java;

/**
 * The Practical12 class illustrates the use of static members in Java,
 * featuring a static variable, a static block executed during class loading,
 * and a static method that can be invoked without creating an object. The main
 * method demonstrates accessing these static elements without instance
 * creation.
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical12 {

	// Static variable
	static int staticVariable = 0;
	int localVariable = 0;

	Practical12() {
		staticVariable++;
		localVariable++;
	}

	// Static block - runs only once when the class is loaded
	static {
		System.out.println("Static block: This runs once during class loading.");
	}

	// Static method
	static void staticMethod() {
		System.out.println("Static method: This can be called without creating an object.");
	}

	public static void main(String[] args) {
		System.out.println("Static variable value: " + staticVariable);
		staticMethod();
		// Creating objects of Practical12 class
		Practical12 practical12 = new Practical12();
		System.out.println("Static variable value after creating an object: " + Practical12.staticVariable);

		Practical12 practical122 = new Practical12();
		System.out.println("Static variable value after creating another object: " + Practical12.staticVariable);

		Practical12 practical123 = new Practical12();
		System.out.println("Static variable value after creating yet another object: " + Practical12.staticVariable);

		// Accessing and modifying instance variable
		System.out.println("Incremented localVariable for practical12: " + ++practical12.localVariable);
		System.out.println("Incremented localVariable for practical122: " + practical122.localVariable++);
		System.out.println("localVariable for practical123: " + practical123.localVariable);
	}

}
