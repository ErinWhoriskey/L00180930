import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {

    // Test to validate program output
    @Test
    void testMainOutput() {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        HelloWorld.main(null);

        assertEquals("Hello World", out.toString().trim());
    }

    // Test to ensure program doesn't throw an exception
    @Test
    void testMainDoesNotThrow() {
        assertDoesNotThrow(() -> HelloWorld.main(null));
    }
}
