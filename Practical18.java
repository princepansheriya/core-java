package com.oops_concepts.java;

import java.util.Scanner;

/**
 * This class provides an example of exception handling in Java. It demonstrates
 * the usage of try-catch blocks and the finally block.
 * 
 * @author prince
 * @version 1.0
 * @since 1/25/2024
 */
public class Practical18 {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter a number: ");
			int numerator = scanner.nextInt();
			System.out.print("Enter another number: ");
			int denominator = scanner.nextInt();
			// Division operation
			int result = divideNumbers(numerator, denominator);
			System.out.println("Result of division: " + result);
		} catch (ArithmeticException e) {
			// Handling arithmetic exception
			System.out.println("Error: " + e.getMessage());
		} catch (Exception e) {
			// Handling general exception
			System.out.println("An unexpected error occurred.");
		} finally {
			// Code in the finally block will always be executed
			System.out.println("Finally block executed.");
		}
	}

	/**
	 * Method to perform division and throw an exception if the denominator is zero.
	 * 
	 * @param numerator   The numerator of the division operation.
	 * @param denominator The denominator of the division operation.
	 * @return The result of the division.
	 * @throws ArithmeticException If the denominator is zero.
	 */
	private static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
		if (denominator == 0) {
			throw new ArithmeticException("Cannot divide by zero..");
		}
		return numerator / denominator;
	}

}
