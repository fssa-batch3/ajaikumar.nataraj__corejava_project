package day08.practice;

import java.util.HashMap;
//import java.util.Scanner;

public class ReapetedKeyCounter {
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter the string: ");
//		String input = scanner.nextLine();

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
