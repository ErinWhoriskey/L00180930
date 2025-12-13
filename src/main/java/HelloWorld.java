import java.util.logging.Logger;

/**
 * Simple Hello World application.
 */
public class HelloWorld {

    private static final Logger logger =
            Logger.getLogger(HelloWorld.class.getName());

    /**
     * Program entry point.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        logger.info("Application started");
        System.out.println("Hello World");
        logger.info("Application finished");
    }
}
