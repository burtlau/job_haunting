package chap13_Collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class MaxTestTest {
    @Test
    public void maxTest()
    {
        SortedSet<Integer> ss = new TreeSet<>(Arrays.asList(1,9,20,31,0,8));
        int max = MaxTest.customMax(ss);
        assertEquals(31, max);
    }

}