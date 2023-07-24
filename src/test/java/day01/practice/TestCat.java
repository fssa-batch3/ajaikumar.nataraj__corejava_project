package day01.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCat {

    @Test
    public void testCatAttributes() {
        // Given
        Cat cat1 = new Cat();
        cat1.setColor("White");
        cat1.setage(4);
        Cat.setSpeaks("Meow!");

        // When
        String color1 = cat1.getColor();
        int age1 = cat1.getage();
        String speaks1 = cat1.getSpeaks();

        // Then
        Assertions.assertEquals("White", color1);
        Assertions.assertEquals(4, age1);
        Assertions.assertEquals("Meow!", speaks1);
    }

    @Test
    public void testSetSpeaks() {
        // Given
        Cat cat2 = new Cat();
        Cat.setSpeaks("Meow!");

        // When
        String speaks2 = cat2.getSpeaks();

        // Then
        Assertions.assertEquals("Meow!", speaks2);
    }

//    @Test
//    public void testDefaultSpeaks() {
//        // Given
//        Cat cat1 = new Cat();
//
//        // When
//        String defaultSpeaks = cat1.getSpeaks();
//
//        // Then
//        Assertions.assertNull(defaultSpeaks);
//    }
}

