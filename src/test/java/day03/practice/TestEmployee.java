package day03.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployee {

    @Test
    public void testEmployeeGetters() {
        // Given
        Employee e1 = new Employee(1, "naresh");
        Employee e2 = new Employee(2, "suresh");

        // When
        int id1 = e1.getInt();
        String name1 = e1.getString();

        int id2 = e2.getInt();
        String name2 = e2.getString();

        // Then
        Assertions.assertEquals(1, id1);
        Assertions.assertEquals("naresh", name1);

        Assertions.assertEquals(2, id2);
        Assertions.assertEquals("suresh", name2);
    }
}

