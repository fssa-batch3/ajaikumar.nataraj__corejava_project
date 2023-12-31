package day01.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;
    private static String speaks;


    // Getters and setters
    public int getage() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSpeaks() {
    	return speaks;
    }
    
    public static void setSpeaks(String speaks) {
    	Cat.speaks = speaks;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
    	Cat cat1 = new Cat();
    	cat1.setColor("White");
    	cat1.setage(4);
    	Cat.setSpeaks("Meow!");
        Cat cat2 = new Cat();
        cat2.setColor("Black");
        cat2.setage(3);
        // cat2.setSpeaks("Meow!");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getage());
        System.out.println("Color: " + cat1.getColor());
        System.out.println("Speaks: " + cat1.getSpeaks());

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getage());
        System.out.println("Color: " + cat2.getColor());
        System.out.println("Speaks: " + cat2.getSpeaks());
    }
}
