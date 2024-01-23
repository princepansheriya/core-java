package com.corejava.java;

/**
 * The Practical11 class extends the Person class, representing a student. It
 * show cases the use of constructors to initialize a person's age, with examples
 * of both non-parameter and parameterized constructors. The main method creates
 * instances of Practical11 with different constructor invocations.
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical11 extends Person {

	Practical11() {
		super(0);
		System.out.println("Non-parameter constructor of Practical11");
	}

	Practical11(int age) {
		super(age);
		System.out.println("User age is set to: " + age + " in Practical11");
	}

	public static void main(String[] args) {
		new Practical11();
		new Practical11(12);
	}

}

/**
 * The Person class encapsulates a person's age. It features a parameterized
 * constructor to set the age when an instance is created. Used as a base class
 * for the Practical11 class.
 */
class Person {
	
	int age;
	Person(int age) {
		this.age = age;
		System.out.println("Person's age is set to: " + this.age);
		
	}

}
