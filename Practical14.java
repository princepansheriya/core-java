package com.oops_concepts.java;

/**
 * A Java class (Practical14) demonstrating the concept of encapsulation where
 * private variables (name and age) are accessed and modified through public
 * setter and getter methods.
 * 
 * The class provides methods to set and get the name and age attributes in a
 * controlled manner.
 * 
 * @author prince
 * @version 1.0
 * @since 1/24/2024
 */
public class Practical14 {

	// Private variables (attributes) to be encapsulated
	private String name;
	private int age;

	/**
	 * Setter method for setting the name attribute.
	 * 
	 * @param name The name to be set.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter method for retrieving the name attribute.
	 * 
	 * @return The current value of the name attribute.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter method for setting the age attribute.
	 * 
	 * @param age The age to be set.
	 */
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Invalid age. Age must be greater than 0.");
		}
	}

	/**
	 * Getter method for retrieving the age attribute.
	 * 
	 * @return The current value of the age attribute.
	 */
	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		Practical14 person = new Practical14();

		// Setting values using setter methods
		person.setName("Abhay");
		person.setAge(21);

		// Getting values using getter methods
		System.out.println("Name: " + person.getName());
		System.out.println("Age: " + person.getAge());
	}

}
