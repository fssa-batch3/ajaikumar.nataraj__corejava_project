package day08.practice;

import java.util.HashMap;

public class ReapetedKeyCounter {
	public static void main(String[] args) {

		String[] input = { "Ram", "Ram", "Superman", "spider", "hey", "hello", "hey", "Spider" };

		// Create a HashMap to store the count of each name
		HashMap<String, Integer> nameCount = new HashMap<>();

		// Count the occurrences of each name
		for (String name : input) {
			nameCount.put(name, nameCount.getOrDefault(name, 0) + 1);
		}

		System.out.println(nameCount);

		// Print the name and its count
		nameCount.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}
