package com.corejava.java;

import java.util.Scanner;

/**
 * This is a simple Java program (Practical2) that takes user input for age and
 * determines whether the person is a child or an adult.
 * 
 * @author prince
 * @version 1.0
 * @since 1/19/2024
 */
public class Practical2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter age = ");

			int age = scan.nextInt();

			if (age < 18) {
				// age is less than 18 work if condition
				System.out.println("Child");
			} else {
				// age is greater than 18 work else condition
				System.out.println("Adult");
			}
		}
	}

}
