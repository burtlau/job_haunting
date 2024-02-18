package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        try
        {
            String className = "com.example.myClass";
            Class<?> myClass = Class.forName(className);
            Object instance = myClass.getDeclaredConstructor().newInstance();
            System.out.println("Loaded class: " + className);

        } catch (ClassNotFoundException e)
        {
            System.err.println("Class not found: " + e.getMessage());
        } catch (Exception e)
        {
            System.err.println("Error occured: " + e.getMessage());
        }
    }
}
