package chap12_GeneralProgramming;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class PairTestIIITest {
    @Test
    public void alg3Test()
    {
        Integer[] array = {1, 4, 5 ,29, 90};
        Pair<Integer> mm = ArrayAlg3.minmax(array);
        int min = mm.getFirst();
        int max = mm.getSecond();
        assertEquals(1, min);
        assertEquals(90, max);
    }

}