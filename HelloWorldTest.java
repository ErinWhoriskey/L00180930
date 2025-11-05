public class HelloWorldTest {
    public static void main(String[] args) {
        System.out.println("Running HelloWorld test...");

        // Run the HelloWorld main method
        HelloWorld.main(null);

        // Quick check of what HelloWorld prints
        String expected = "Hello, World!";
        String actual = getHelloWorldOutput();

        if (actual.equals(expected)) {
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed. Expected: " + expected + " but got: " + actual);
        }
    }

    // Basic helper method to get the HelloWorld output
    private static String getHelloWorldOutput() {
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));
        HelloWorld.main(null);
        return out.toString().trim();
    }
}
