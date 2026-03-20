import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
public class HelloTest {
    @Test
    void testGreeting() {
        assertEquals("Wrong Output", Hello.greet());
    }
}