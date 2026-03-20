package test.java;

import static org.junit.jupiter.api.Assertions.*;

import main.java.Hello;
import org.junit.jupiter.api.Test;
public class HelloTest {
    @Test
    void testGreeting() {
        assertEquals("Hello CI/CD", Hello.greet());
    }
}