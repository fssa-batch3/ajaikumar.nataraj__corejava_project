package day06.solved;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Store the city names in the List
		ArrayList cityList = new ArrayList();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Kolkata");
		cityList.add("Delhi");
		cityList.add("Hyderabad");
		cityList.add("Lucknow");
		cityList.add("Rajasthan");
		
		
		
		System.out.println(cityList.set(3, "Gujarat"));

		// Display the city names
		for (Object object : cityList) {
			String cityName = (String) object; // TypeCast object to String
			System.out.println(cityName);
		}
		
		System.out.println(cityList);	// Use of toString method of 'Object' class

	}

}
