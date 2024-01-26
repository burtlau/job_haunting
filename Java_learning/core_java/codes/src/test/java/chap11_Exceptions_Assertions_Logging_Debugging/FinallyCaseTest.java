package chap11_Exceptions_Assertions_Logging_Debugging;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinallyCaseTest {
    @Test
    public void runWithoutFinal ()
    {
        int num = FinallyCase.f(5);
        assertEquals(25,  num);
    }

    @Test
    public void runWithFinal ()
    {
        int num = FinallyCase.f(2);
        assertEquals(0,  num);
    }

}