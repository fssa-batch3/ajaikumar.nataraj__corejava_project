package day02.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUser {

    @Test
    public void testUserGettersAndSetters() {
        // Given
        User user = new User();

        // When
        user.setId(22);
        user.setName("Ajai");
        user.setEmialId("ajai@gmail.com");
        user.setPassword("Ajai@123");

        // Then
        Assertions.assertEquals(22, user.getId());
        Assertions.assertEquals("Ajai", user.getName());
        Assertions.assertEquals("ajai@gmail.com", user.getEmialId());
        Assertions.assertEquals("Ajai@123", user.getPassword());
    }
}

