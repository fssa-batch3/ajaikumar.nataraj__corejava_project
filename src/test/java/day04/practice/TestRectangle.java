package day04.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRectangle {

    @Test
    public void testSquare() {
        // Given
        double side = 5.0;
        Square square = new Square(side);

        // When
        double length = square.getLength();
        double expectedArea = side * side;
        double actualArea = square.calculateArea();

        // Then
        Assertions.assertEquals(side, length, 0.0001); // Tolerate small floating-point errors
        Assertions.assertEquals(expectedArea, actualArea, 0.0001);
    }
}

