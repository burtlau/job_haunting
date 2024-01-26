package chap11_Exceptions_Assertions_Logging_Debugging;

import java.util.logging.Logger;

public class GeneralLogger {
    public static void main(String[] args) {
        Logger.getGlobal().info("File->Open menu item selected");
        int result = performSomeOperation();
        Logger.getGlobal().info("Operation result: " + result);
    }

    private static int performSomeOperation() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return a result
        return 42;
    }
}
