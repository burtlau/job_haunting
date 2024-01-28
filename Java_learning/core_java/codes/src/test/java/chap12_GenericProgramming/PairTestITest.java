package chap12_GenericProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairTestITest {
    @Test
    public void minMaxMethodTest()
    {
        String[] string = {"Burt", "is", "the", "smartest", "guy"};
        Pair<String> pair = ArrayAlg.minmax(string);
        String min = pair.getFirst();
        String max = pair.getSecond();
        assertEquals("Burt", min);
        assertEquals("the", max);
    }

}