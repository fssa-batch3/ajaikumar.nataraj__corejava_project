package day07.solved;

import java.util.TreeSet;

public class TreeSetDemo {
 
    public static void main(String[] args) {
 
        // TreeSet sorts the collections
        TreeSet<String> cityNames = new TreeSet<String>();
        cityNames.add("Delhi");
        cityNames.add("Kolkata");
        cityNames.add("Chennai");
        cityNames.add("Caennai");
        cityNames.add("Bangalore");
        
//        cityNames.add("1");
//        cityNames.add("40");
//        cityNames.add("2");
//        cityNames.add("7");
//        cityNames.add("10");
 
        for (String cityName : cityNames) {
            System.out.println(cityName);
        }
         
         
    }
 
}
