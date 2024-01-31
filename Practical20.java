package com.oops_concepts.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This program demonstrates the usage of a List, adding elements to it, and
 * iterating through the list using both enhanced for loop and Iterator.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical20 {

	public static void main(String[] args) {
		// Creating a List of Strings
		List<String> list = new ArrayList<>();

		// Adding elements to the list
		list.add("Hello");
		list.add("World");
		list.add("Prince");

		// Iterating through the list using enhanced for loop
		for (String a : list) {
			System.out.println(a);
		}

		System.out.println(".........");

		// Iterating through the list using Iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println(value);
		}
	}

}
