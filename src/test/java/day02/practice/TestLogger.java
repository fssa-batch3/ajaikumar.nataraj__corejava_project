package day02.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLogger {

    private final PrintStream originalOut = System.out;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void testLoggerMethods() {
        // When
        Logger.debug("Debugging loading...");
        Logger.info("Info loading...");
        Logger.error("Error loading...");
        Logger.debug(5);
        Logger.info(6);
        Logger.error(8);

        // Then
        String expectedOutput =
                "DEBUG: Debugging loading...\n" +
                "INFO: Info loading...\n" +
                "ERROR: Error loading...\n" +
                "DEBUG: 5\n" +
                "Info: 6\n" +
                "Error: 8\n";

        assertEquals(expectedOutput, outputStream.toString());
    }
}

