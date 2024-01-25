package com.multilevelinheritance;

//Parent class representing an Animal
class Animal {

	/**
	 * Makes the animal eat.
	 */
	public void eat() {
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

//Grandchild class representing a Labrador, inheriting from Dog
class Labrador extends Dog {

	/**
	 * Makes the Labrador swim.
	 */
	void swim() {
		System.out.println("Labrador is swimming.");
	}

}

/**
 * A Java class (Practical15Multilevelinheritance) demonstrating multilevel
 * inheritance where a Labrador is a type of Dog and Dog is a type of Animal.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical15Multilevelinheritance {

	public static void main(String[] args) {
		Labrador myLabrador = new Labrador();

		myLabrador.eat(); // Inherited from Animal class
		myLabrador.bark(); // Inherited from Dog class
		myLabrador.swim(); // Specific to Labrador class
	}

}
