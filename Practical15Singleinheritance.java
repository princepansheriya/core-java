package com.singleinheritance.java;

//Parent class representing an Animal
class Animal {

	/**
	 * Makes the animal eat.
	 */
	void eat() {
		System.out.println("Animal is eating.");
	}

}

//Child class representing a Dog, inheriting from Animal
class Dog extends Animal {

	/**
	 * Makes the dog bark.
	 */
	void bark() {
		System.out.println("Dog is barking.");
	}

}

/**
 * A Java class (Practical15Singleinheritance) demonstrating single inheritance
 * where a Dog is a type of Animal.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical15Singleinheritance {

	public static void main(String[] args) {
		// Instance of the subclass
		Dog myDog = new Dog();

		myDog.eat(); // Inherited from Animal class
		myDog.bark(); // Specific to Dog class
	}

}
