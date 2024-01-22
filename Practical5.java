package com.corejava.java;

/**
 * A simple Java program (Practical5) using nested loops to print a pattern of asterisks. 
 * Each row contains an increasing number of asterisks, and the inner loop breaks when i equals j.
 * 
 * @author prince
 * @version 1.0
 * @since 1/19/2024
 */
public class Practical5 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 6; j++) {
				System.out.print("* ");
				if (i == j) {
					System.out.println();
					break;
				}
			}
		}
	}

}
