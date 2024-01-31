package com.oops_concepts.java;

/**
 * This class provides an example of finding an element in an array by index.
 * 
 * @author prince
 * @version 1.0
 * @since 1/25/2024
 */
public class Practical19 {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 3, 8, 7, 12, 11, 43 };

		int index = 7;
		int value = 0;

		if (index > -1 && index < arr.length) {
			for (int i = 0; i < arr.length; i++) {
				if (index == i) {
					value = arr[i];
					break;
				}
			}
			System.out.println("In array " + index + " index value is = " + value);
		} else {
			System.out.println("Index is not valid");
		}
	}

}
