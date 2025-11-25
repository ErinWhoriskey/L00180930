import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HelloWorldOutputTest {
    //test to validate input
    @Test
    void testMainOutput() {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        HelloWorld.main(null);

        String expected = "Hello World";
        String actual = out.toString().trim();

        assertEquals(expected, actual);
    }
    //test to ensure main doesnt throw errors
    class HelloWorldNoCrashTest {

    @Test
    void testMainDoesNotThrow() {
        assertDoesNotThrow(() -> HelloWorld.main(null));
    }
}
