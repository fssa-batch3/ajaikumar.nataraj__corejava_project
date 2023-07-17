package day06.practice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		
		System.out.println(cityList);
		
	    Set<String> set = new LinkedHashSet<>();
	    set.addAll(cityList);

	    // delete al elements of arraylist
	    cityList.clear();

	    // add element from set to arraylist
	    cityList.addAll(set);
	    
	    System.out.println(cityList);
	}

}
