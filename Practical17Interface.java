package com.oops_concepts.java;

//Interface defining the contract for objects that can make sounds
interface Soundable {

	/**
	 * Produces a sound.
	 */
	void makeSound();

}

//Class representing a Horse that implements the Soundable interface
class Horse implements Soundable {

	/**
	 * Produces a neighing sound specific to horses.
	 */
	public void makeSound() {
		System.out.println("Horse neighs");
	}

}

//Class representing a Car that implements the Soundable interface
class Car implements Soundable {

	/**
	 * Produces the sound of a car engine revving.
	 */
	public void makeSound() {
		System.out.println("Car engine revs");
	}

}

/**
 * Practical17Interface class to demonstrate the use of the Soundable interface with Horse and
 * Car objects. It creates instances of Horse and Car and calls their make sound
 * methods to produce sounds.
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical17Interface {

	public static void main(String[] args) {
		// Creating objects of Horse and Car
		Horse myHorse = new Horse();
		Car myCar = new Car();

		// Making sounds
		myHorse.makeSound(); // Horse neighs
		myCar.makeSound(); // Car engine revs
	}

}
