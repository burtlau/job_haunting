package chap11_Exceptions_Assertions_Logging_Debugging;

public class FinallyCase {
    public static void main(String[] args) {
        int result = f(3);
        System.out.println(result);

        int result2 = f(2);
        System.out.println(result2);

    }

    public static int f(int n)
    {
        try
        {
            int r = n * n ;
            return r;
        }
        finally {
            if (n == 2) return 0 ;
        }
    }
}
