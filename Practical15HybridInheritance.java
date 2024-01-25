package com.hybridinheritance;

//Parent class representing an Animal
class Animal {

	/**
	 * Makes the animal eat.
	 */
	void eat() {
		System.out.println("Animal is eating");
	}

}

//Child class representing a Fish, inheriting from Animal
class Fish extends Animal {

	/**
	 * Makes the fish swim.
	 */
	void swim() {
		System.out.println("Fish is swimming");
	}

	@Override
	void eat() {
		System.out.println("Fish is eating");
	}

}

//Child class representing a Bird, inheriting from Animal
class Bird extends Animal {

	/**
	 * Makes the bird fly.
	 */
	void fly() {
		System.out.println("Bird is flying");
	}

	@Override
	void eat() {
		System.out.println("Bird is eating");
	}

}

class FlyingFish extends Fish {

	/**
	 * Makes the flying fish fly.
	 */
	void fly() {
		System.out.println("FlyingFish is flying");
	}

}

/**
 * A Java class (Practical15HybridInheritance) demonstrating hybrid inheritance
 * where Fish and Bird are types of Animal, and FlyingFish inherits from both
 * Fish and Animal.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical15HybridInheritance {

	public static void main(String[] args) {
		Fish fish = new Fish();
		fish.eat();
		fish.swim();

		Bird bird = new Bird();
		bird.eat();
		bird.fly();

		FlyingFish flyingFish = new FlyingFish();
		flyingFish.eat();
		flyingFish.swim();
		flyingFish.fly();
	}

}
