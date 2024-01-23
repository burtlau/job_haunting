package chap6_interfaceAndInnerClass;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaticInnerClassTestTest {
    @Test
    public void minMaxTest()
    {
        double[] values = {5.0, 2.0, 9.0, 1.0, 7.0};
        ArrayAlg.Pair result = ArrayAlg.minmax(values);

        assertEquals(1.0, result.getFirst(), 0.001);
        assertEquals(9.0, result.getSecond(), 0.001);
    }

}