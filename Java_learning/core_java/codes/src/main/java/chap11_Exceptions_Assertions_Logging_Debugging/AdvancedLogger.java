package chap11_Exceptions_Assertions_Logging_Debugging;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdvancedLogger {
    private static final Logger logger = Logger.getLogger(AdvancedLogger.class.getName());

    public static void main(String[] args) {
        configureLogger();
        // Create an instance of AdvancedLoggerClass
        AdvancedLogger advancedLoggerClass = new AdvancedLogger();

        // Call the readImage method to test
        try {
            advancedLoggerClass.readImage();
        } catch (IOException e) {
            logger.log(Level.WARNING, "Reading image", e);
        }
    }

    private static void configureLogger() {
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);

        logger.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
    }

    public void readImage() throws IOException {
        logger.entering(AdvancedLogger.class.getName(), "read");

        try {
            if (true) {
                IOException exception = new IOException("Image reading error");
                logger.throwing(AdvancedLogger.class.getName(), "read", exception);
                throw exception;
            } else {
                logger.log(Level.FINE, "Image read successfully");
            }
        } finally {
            logger.exiting(AdvancedLogger.class.getName(), "read");
        }
    }
}