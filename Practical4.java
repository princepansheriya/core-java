package com.corejava.java;

import java.util.Scanner;

/**
 * A simple Java program (Practical4) that uses while and do-while loops to print a sequence of numbers
 * based on user-input start and end values. Demonstrates the difference between while and do-while loops.
 * 
 * @author prince
 * @version 1.0
 * @since 1/19/2024
 */
public class Practical4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter values for while loop start and end = ");
		int i = scan.nextInt();
		int j = scan.nextInt();

		System.out.println("--------while--------");
		while (i <= j) {
			System.out.println(i++);
		}

		System.out.println("Enter values for do while loop start and end");
		i = scan.nextInt();
		j = scan.nextInt();
		System.out.println("--------do while--------");
		do {
			System.out.println(i++);
		} while (i <= j);
		scan.close();
	}

}
