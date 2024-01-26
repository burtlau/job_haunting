package chap11_Exceptions_Assertions_Logging_Debugging;

/**
 *  use java -ea AssertCase.java to enable assertions
 *  use java -da AssertCase.java to disable the assertions;
 */
public class AssertCase {
    public static void main(String[] args) {
        double x = 4;
        System.out.println(sqrt(x));

        double y = -1;
        try {
            System.out.println(sqrt(y));
        } catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
    }

    public static double sqrt(double x) throws IllegalArgumentException
    {
        assert x >= 0 : "x must be non-negative";
        if(x < 0){
            throw new IllegalArgumentException();
        }
        else
        {
            return Math.sqrt(x);
        }
    }
}
