package chap11_Exceptions_Assertions_Logging_Debugging.CheckedExceptions;

public class CloneNotSupportedExample {
    public static void main(String[] args) {
        try {
            MyCloneableClass original = new MyCloneableClass("Hello, World!");
            MyCloneableClass cloned = (MyCloneableClass) original.clone();
            System.out.println("Original: " + original.getMessage());
            System.out.println("Cloned: " + cloned.getMessage());
        } catch (CloneNotSupportedException e) {
            System.err.println("Clone Not Supported Exception: " + e.getMessage());
        }
    }

}

class MyCloneableClass implements Cloneable {
    private String message;

    public MyCloneableClass(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}