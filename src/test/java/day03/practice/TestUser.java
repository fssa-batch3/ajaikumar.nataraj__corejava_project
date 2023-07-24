package day03.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUser {

    @Test
    public void testUserConstructorAndGetters() {
        // Given
        String username = "Ajaikumar";
        String useremail = "ajaikumarnatarajan@gmail.com";
        String userpassword = "Ajai@1235";

        // When
        User user = new User(username, useremail, userpassword);

        // Then
        Assertions.assertEquals(username, user.getName());
        Assertions.assertEquals(useremail, user.getEmail());
        Assertions.assertEquals(userpassword, user.getPassword());
    }
}

