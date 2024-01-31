package com.oops_concepts.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This program demonstrates how to remove duplicate elements from a list using
 * a Set in Java. It creates a list with duplicate values, then utilizes a
 * HashSet to efficiently remove duplicates. The resulting list without
 * duplicates is displayed.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
public class Practical22 {

	public static void main(String[] args) {
		// Creating a list with duplicate values
		List<String> originalList = new ArrayList<>();
		originalList.add("A");
		originalList.add("D");
		originalList.add("C");
		originalList.add("B");
		originalList.add("A");
		originalList.add("C");
		originalList.add("E");
		originalList.add("E");
		originalList.add("E");

		// Displaying the original list
		System.out.println("Original List: " + originalList);

		// Removing duplicates using a Set
		Set<String> uniqueSet = new HashSet<>(originalList);
		List<String> listWithoutDuplicates = new ArrayList<>(uniqueSet);

		// Displaying the list after removing duplicates
		System.out.println("List without Duplicates using set: " + listWithoutDuplicates);

		removeDuplicates(originalList);
		System.out.println("List without Duplicates using foreach: " + removeDuplicates(originalList));
	}

	/**
	 * Removes duplicates from a list and returns a new list without duplicates.
	 * 
	 * @param originalList The original list with duplicates.
	 * @return A new list without duplicates.
	 */
	private static List<String> removeDuplicates(List<String> originalList) {
		List<String> listWithoutDuplicates = new ArrayList<>();

		for (String element : originalList) {
			if (!listWithoutDuplicates.contains(element)) {
				// If the element is not already in the new list, add it
				listWithoutDuplicates.add(element);
			}
		}

		return listWithoutDuplicates;
	}

}
