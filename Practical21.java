package com.oops_concepts.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * This program demonstrates the usage of a Map and a Set in Java. It creates a
 * Map to store student scores and a Set to store unique student names.
 * Additionally, it displays the content of both the Map and the Set.
 * 
 * @author prince
 * @version 1.0
 * @since 1/29/2024
 */
class Practical21 {

	public static void main(String[] args) {
		// Creating a Map to store student scores
		Map<String, Integer> studentScores = new HashMap<>();

		// Adding data to the Map
		studentScores.put("Alice", 90);
		studentScores.put("Bob", 85);
		studentScores.put("Charlie", 92);
		studentScores.put("Bob", 80);
		studentScores.put(null, 80);

		// Displaying the Map
		System.out.println("Student Scores: " + studentScores);

		// Creating a Set to store unique student names
		Set<String> studentNames = new HashSet<>();

		// Adding data to the Set
		studentNames.add("Alice");
		studentNames.add("Bob");
		studentNames.add("Charlie");
		studentNames.add("Bob"); // Adding a duplicate, but Set will store only unique names
		studentNames.add(null);
		
		// Displaying the Set
		System.out.println("Unique Student Names: " + studentNames);

		// Accessing values from the Map using keys
		int bobScore = studentScores.get("Bob");
		System.out.println("Bob's Score: " + bobScore);
	}
	
}
