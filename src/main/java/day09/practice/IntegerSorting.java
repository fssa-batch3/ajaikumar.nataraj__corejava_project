package day09.practice;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> integer = new ArrayList<Integer>();
		integer.add(8);
		integer.add(9);
		integer.add(45);
		integer.add(12);
		integer.add(1);
		integer.add(5);
		
		System.out.println(integer);
		
		Collections.sort(integer);
		
		System.out.println(integer);
		
		
	}
}
