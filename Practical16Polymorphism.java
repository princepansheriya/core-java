package com.oops_concepts.java;

//Parent class representing an Animal
class Animal {

	/**
	 * Makes a sound, generic to all animals.
	 */
	void sound() {
		System.out.println("Animal makes a sound");
	}

}

//Child class representing a Dog, inheriting from Animal
class Dog extends Animal {

	/**
	 * Overrides the sound method to specify a bark for a Dog.
	 */
	@Override
	void sound() {
		System.out.println("Dog barks");
	}

	/**
	 * Specific behavior for a Dog, fetching a ball.
	 */
	void fetch() {
		System.out.println("Dog fetches a ball");
	}

}

/**
 * A Java class (Practical16Polymorphism) demonstrating compile-time and runtime
 * polymorphism using method overloading and overriding.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical16Polymorphism {

	/**
	 * Adds two integers and returns the result.
	 */
	static int add(int a, int b) {
		return a + b;
	}

	/**
	 * Adds two doubles and returns the result.
	 */
	static double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		// Compile-time polymorphism example
		System.out.println("Adding integers: " + add(5, 10));
		System.out.println("Adding doubles: " + add(5.5, 10.5));

		// Runtime polymorphism example
		Animal animal = new Dog();
		animal.sound();

		Dog dog = new Dog();

		dog.fetch();
	}

}
