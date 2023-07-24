package day07.solved;

import java.util.TreeSet;

public class TreeSetDemo {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
       // TreeSet<String> cityNames = new TreeSet<String>();
//        cityNames.add("Delhi");
//        cityNames.add("Kolkata");
//        cityNames.add("Chennai");
//        cityNames.add("Caennai");
//        cityNames.add("Bangalore");
    	
//        for (String cityName : cityNames) {
//            System.out.println(cityName);
//        }
        
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        Numbers.add(1);
        Numbers.add(40);
        Numbers.add(10);
        Numbers.add(8);
        Numbers.add(2);
 
        for (Integer Number : Numbers) {
            System.out.println(Number);
        }
         
         
    }
 
}
