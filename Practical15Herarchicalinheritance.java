package com.herarchicalinheritance;

//Parent class representing an Animal
class Animal {

	/**
	 * Makes the animal eat.
	 */
	void eat() {
		System.out.println("Animal is eating.");
	}

}

//Child class 1 representing a Dog, inheriting from Animal
class Dog extends Animal {

	/**
	 * Makes the dog bark.
	 */
	void bark() {
		System.out.println("Dog is barking.");
	}

}

//Child class 2 representing a Cat, inheriting from Animal
class Cat extends Animal {

	/**
	 * Makes the cat meow.
	 */
	void meow() {
		System.out.println("Cat is meowing.");
	}

}

/**
 * A Java class (Practical15Herarchicalinheritance) demonstrating hierarchical
 * inheritance where Dog and Cat are types of Animal.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical15Herarchicalinheritance {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Cat myCat = new Cat();

		myDog.eat(); // Inherited from Animal class
		myDog.bark(); // Specific to Dog class

		myCat.eat(); // Inherited from Animal class
		myCat.meow(); // Specific to Cat class
	}
}
