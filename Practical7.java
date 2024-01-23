package com.corejava.java;

/**
 * A simple Java class (Practical7) show casing constructor usage. Includes a
 * default constructor printing the initial value of the 'result' variable, and
 * a parameterized constructor calculating the product of two numbers and
 * displaying the result.
 * 
 * @author prince
 * @version 1.0
 * @since 1/22/2024
 */
public class Practical7 {
	
	int result;

	Practical7() {
		System.out.println(result);
	}

	public Practical7(int a, int b) {
		result = a * b;
		System.out.println(result);
	}

	public static void main(String[] args) {
		new Practical7();
		int a = 10;
		int b = 20;
		new Practical7(a, b);
	}

}
