package chap11_Exceptions_Assertions_Logging_Debugging;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTraceTestTest {
    @Test
    public void testFactorialWithPositiveNumber() {
        int n = 5;
        int result = StackTraceTest.factorial(n);
        assertEquals(120, result);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        int n = -2;
        int result = StackTraceTest.factorial(n);
        assertEquals(1, result);
    }

}