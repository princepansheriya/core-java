package com.corejava.java;

/**
 * A simple Java program (Practical6) using a for loop to iterate through numbers. 
 * Demonstrates the use of continue and break statements to control the loop flow.
 * 
 * @author prince
 * @version 1.0
 * @since 1/19/2024
 */
public class Practical6 {

	public static void main(String[] args) {
		for (int i = 1; true; i++) {
			if (i == 8) {
				continue;
			} else if (i == 11) {
				break;
			}
			System.out.println(i);
		}
	}
}
