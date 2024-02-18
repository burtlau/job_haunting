package chap13_Collection;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SieveTest {
    @Test
    public void sieveTestTest()
    {
        int n = 1000;
        assertEquals(168, Sieve.primeCounts(n));
    }

}