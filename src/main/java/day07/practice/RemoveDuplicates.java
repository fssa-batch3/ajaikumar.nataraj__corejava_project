package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> cityNames = new ArrayList<Integer>();
		cityNames.add(1);
		cityNames.add(3);
		cityNames.add(3);
		cityNames.add(1);

		System.out.println("Using ArrayList :" + cityNames);

		// Set stores unique elements and ignores duplication
		HashSet<Integer> cityNamesSet = new HashSet<Integer>();
		cityNamesSet.add(1);
		cityNamesSet.add(3);
		cityNamesSet.add(3);
		cityNamesSet.add(1);

		System.out.println("Using Set :" + cityNamesSet);
	}

}
