package com.corejava.java;

/**
 * A simple Java program to demonstrate different ways of comparing integer
 * values. It includes comparisons using the equals() method, direct value
 * comparison, and compareTo() method.
 * 
 * @author prince
 * @version 1.0
 * @since 1/22/2024
 */
public class Practical9 {

	public static void main(String[] args) {
		Integer num1 = Integer.valueOf(0);
		Integer num2 = 20;
		int num3 = 20;

		boolean isEqualUsingEquals = num1.equals(num2);
		boolean isEqualDirectComparison = (num1 == num2);
		int result = num1.compareTo(num3);

		System.out.println("Using equals() method: " + isEqualUsingEquals);
		System.out.println("Direct comparison of values: " + isEqualDirectComparison);
		System.out.println("Using compareTo: " + result);
	}

}
