package day06.solved;

public class StringArray {
	public static void main(String[] args) {

		// How its stored in an normal array
		String[] cityArr = new String[4];
		cityArr[0] = "Chennai";
		cityArr[1] = "Bangalore";
		cityArr[2] = "Mumbai";

		// Display the city names
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}

		System.out.println();

		cityArr[3] = "Delhi";

		// Display the city names after adding delhi
		for (String cityName : cityArr) {
			System.out.println(cityName);
		}

		System.out.println();

		for (int i = 0; i < cityArr.length; i++) {
			if (cityArr[i].equals("Bangalore")) {
				cityArr[i] = "Kolkata";
			}
			System.out.println(cityArr[i]);
		}
		System.out.println();

		for (int i = 0; i < cityArr.length; i++) {
			if (cityArr[i].equals("Mumbai")) {
				cityArr[i] = cityArr[i + 1];
			}	
			System.out.println(cityArr[i]);
		}
		System.out.println();
		cityArr[3] = null;
		
		for (int i = 0; i < cityArr.length; i++) {
			System.out.println(cityArr[i]);
		}
		
		
	}
}
