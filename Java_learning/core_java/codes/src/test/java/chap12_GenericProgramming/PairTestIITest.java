package chap12_GenericProgramming;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairTestIITest {
    @Test
    public void intArrayAlgTest(){
        Integer[] newArray = {4, -2, 3, 0, 100};
        Pair<Integer> pair = IntArrayAlg.minmax(newArray);
        int min = pair.getFirst();
        int max = pair.getSecond();
        assertEquals(-2, min);
        assertEquals(100, max);
    }

}