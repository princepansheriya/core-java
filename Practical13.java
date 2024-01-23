package com.oops_concepts.java;

/**
 * Main class representing the entry point of the program.
 * 
 * 
 * @author prince
 * @version 1.0
 * @since 1/23/2024
 */
public class Practical13 {

	public static void main(String[] args) {
		Circle circle = new Circle(5);
		Rectangle rectangle = new Rectangle(4, 6);

		System.out.println("Area of the circle: " + circle.calculateArea());
		System.out.println("Area of the rectangle: " + rectangle.calculateArea());
	}

}

/**
 * Abstract class serving as the base class for geometric shapes.
 */
abstract class Shape {

	/**
	 * Calculates the area of the geometric shape.
	 * 
	 * @return The area of the shape.
	 */
	abstract double calculateArea();

}

/**
 * Subclass of Shape representing a circle with a given radius.
 */
class Circle extends Shape {

	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	double calculateArea() {
		return Math.PI * radius * radius;
	}

}

/**
 * Subclass of Shape representing a rectangle with given length and width.
 */
class Rectangle extends Shape {

	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		return length * width;
	}

}
