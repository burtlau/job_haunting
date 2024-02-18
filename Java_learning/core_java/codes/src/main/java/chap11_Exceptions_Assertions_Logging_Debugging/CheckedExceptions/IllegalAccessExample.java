package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.nio.file.NoSuchFileException;

public class IllegalAccessExample {
    public static void main(String[] args) {
        try {
            Myclass myInstance = new Myclass();
            Class<?> myClass = myInstance.getClass();
            Field privateField = myClass.getDeclaredField("privateFields");
            privateField.setAccessible(true);
            String value = (String) privateField.get(myInstance);
            System.out.println("Private Field Value: " + value);
        } catch (IllegalAccessException e)
        {
            System.err.println("Illegal Access Exception: " + e.getMessage());
        } catch (NoSuchFieldException e) {
            System.err.println("No such field Exception " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}

class Myclass
{
    private String privateField = "I'm a private field!";
}
